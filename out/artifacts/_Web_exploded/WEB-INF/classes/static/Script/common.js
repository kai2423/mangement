function setImgView(fileId, imgId) {
		var obj = document.getElementById(fileId);
		if (/msie/.test(navigator.userAgent.toLowerCase())) {
			document.getElementById(imgId).src = obj.value;
			getContentImageFristLoad($("#"+imgId),120,160);
		} else {
			var objUrl = getObjectURL(obj.files[0]);
			if (objUrl) {
				document.getElementById(imgId).src = objUrl;
				getContentImageFristLoad($("#"+imgId),120,160);
			}
		}
	}
	//建立一个可存取到该file的url    
	function getObjectURL(file) {
		var url = null;
		if (window.createObjectURL != undefined) {
			url = window.createObjectURL(file);
		} else if (window.URL != undefined) {
			url = window.URL.createObjectURL(file);
		} else if (window.webkitURL != undefined) {
			url = window.webkitURL.createObjectURL(file);
		}
		return url;
	}
	//图片自动缩放
	function getContentImageFristLoad(obj, width, height) {
	    var layoutwidth = width;
	    var layoutheight = height;

	    var thiswidth = 0, thisheight = 0;
	    var imgobj = document.createElement("img");
	    imgobj.setAttribute("id", "imagecontentimg");
	    imgobj.setAttribute("src", obj.attr("src"));
	    imgobj.setAttribute("style", "display:none");
	    document.body.appendChild(imgobj);
	    var image = new Image();
	    image.src = $("#imagecontentimg").attr("src");
	    thiswidth = image.width;
	    thisheight = image.height;
	    imgobj.parentNode.removeChild(imgobj);

	    if (width != height) {
	        layoutwidth = width;
	        layoutheight = thisheight * (width / thiswidth);
	        if (layoutheight > height) {
	            layoutwidth = layoutwidth * (height / layoutheight);
	            layoutheight = height;
	        }
	        obj.width(layoutwidth);
	        obj.height(layoutheight);
	    }
	    else {
	        if (thiswidth > thisheight) {
	            obj.width(width);
	            obj.height(thisheight * (width / thiswidth));
	            obj.css("marginTop", (width - (thisheight * (width / thiswidth))) / 2 + "px");
	        }
	        else if (thiswidth < thisheight) {
	            obj.width(thiswidth * (height / thisheight));
	            obj.height(height);
	        }
	        else {
	            obj.width(width);
	            obj.height(height);
	        }
	    }
	}