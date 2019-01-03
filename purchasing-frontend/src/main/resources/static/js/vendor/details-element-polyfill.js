/*
Details Element Polyfill 2.0.4
Copyright © 2018 Javan Makhmali
 */
(function(){}).call(this),function(){var t,e,n,r,u,o,i,a,s,l,c,d,f;c={element:function(){var t,e,n,r,u;return e=document.createElement("details"),"open"in e?(e.innerHTML="<summary>a</summary>b",e.setAttribute("style","position: absolute; left: -9999px"),r=null!=(u=document.body)?u:document.documentElement,r.appendChild(e),t=e.offsetHeight,e.open=!0,n=e.offsetHeight,r.removeChild(e),t!==n):!1}(),toggleEvent:function(){var t;return t=document.createElement("details"),"ontoggle"in t}()},c.element&&c.toggleEvent||(a=function(){return document.head.insertAdjacentHTML("afterbegin",'<style>@charset"UTF-8";details:not([open])>*:not(summary){display:none;}details>summary{display:block;}details>summary::before{content:"\u25ba";padding-right:0.3rem;font-size:0.6rem;cursor:default;}details[open]>summary::before{content:"\u25bc";}</style>')},i=function(){var t,e,n,r;return e=document.createElement("details").constructor.prototype,r=e.setAttribute,n=e.removeAttribute,t=Object.getOwnPropertyDescriptor(e,"open"),Object.defineProperties(e,{open:{get:function(){var e;return"DETAILS"===this.tagName?this.hasAttribute("open"):null!=t&&null!=(e=t.get)?e.call(this):void 0},set:function(e){var n;return"DETAILS"===this.tagName?(e?this.setAttribute("open",""):this.removeAttribute("open"),e):null!=t&&null!=(n=t.set)?n.call(this,e):void 0}},setAttribute:{value:function(t,e){return f(this,function(n){return function(){return r.call(n,t,e)}}(this))}},removeAttribute:{value:function(t){return f(this,function(e){return function(){return n.call(e,t)}}(this))}}})},s=function(){return u(function(t){var e;return e=t.querySelector("summary"),t.hasAttribute("open")?(t.removeAttribute("open"),e.setAttribute("aria-expanded",!1)):(t.setAttribute("open",""),e.setAttribute("aria-expanded",!0))})},o=function(){var e,n,u,o,i;for(o=r(document.documentElement,"SUMMARY"),e=0,n=o.length;n>e;e++)i=o[e],t(i);return"undefined"!=typeof MutationObserver&&null!==MutationObserver?(u=new MutationObserver(function(e){var n,u,o,a,s;for(a=[],u=0,o=e.length;o>u;u++)n=e[u].addedNodes,a.push(function(){var e,u,o;for(o=[],e=0,u=n.length;u>e;e++)s=n[e],o.push(function(){var e,n,u,o;for(u=r(s,"SUMMARY"),o=[],e=0,n=u.length;n>e;e++)i=u[e],o.push(t(i));return o}());return o}());return a}),u.observe(document.documentElement,{subtree:!0,childList:!0})):document.addEventListener("DOMNodeInserted",function(e){var n,u,o,a;for(o=r(e.target,"SUMMARY"),a=[],n=0,u=o.length;u>n;n++)i=o[n],a.push(t(i));return a})},t=function(t,e){return null==e&&(e=n(t,"DETAILS")),t.setAttribute("aria-expanded",e.hasAttribute("open")),t.hasAttribute("tabindex")||t.setAttribute("tabindex","0"),t.hasAttribute("role")?void 0:t.setAttribute("role","button")},l=function(){var t;return"undefined"!=typeof MutationObserver&&null!==MutationObserver?(t=new MutationObserver(function(t){var e,n,r,u,o,i;for(o=[],n=0,r=t.length;r>n;n++)u=t[n],i=u.target,e=u.attributeName,"DETAILS"===i.tagName&&"open"===e?o.push(d(i)):o.push(void 0);return o}),t.observe(document.documentElement,{attributes:!0,subtree:!0})):u(function(t){var e;return e=t.getAttribute("open"),setTimeout(function(){return t.getAttribute("open")!==e?d(t):void 0},1)})},e=function(t){return!(t.defaultPrevented||t.ctrlKey||t.metaKey||t.shiftKey||t.target.isContentEditable)},u=function(t){return addEventListener("click",function(r){var u,o;return e(r)&&r.which<=1&&(u=n(r.target,"SUMMARY"))&&"DETAILS"===(null!=(o=u.parentElement)?o.tagName:void 0)?t(u.parentElement):void 0},!1),addEventListener("keydown",function(r){var u,o,i;return e(r)&&(13===(o=r.keyCode)||32===o)&&(u=n(r.target,"SUMMARY"))&&"DETAILS"===(null!=(i=u.parentElement)?i.tagName:void 0)?(t(u.parentElement),r.preventDefault()):void 0},!1)},r=function(t,e){var n;return n=[],t.nodeType===Node.ELEMENT_NODE&&(t.tagName===e&&n.push(t),n.push.apply(n,t.getElementsByTagName(e))),n},n=function(){return"function"==typeof Element.prototype.closest?function(t,e){return t.closest(e)}:function(t,e){for(;t;){if(t.tagName===e)return t;t=t.parentNode}}}(),d=function(t){var e;return e=document.createEvent("Events"),e.initEvent("toggle",!0,!1),t.dispatchEvent(e)},f=function(t,e){var n,r;return n=t.getAttribute("open"),r=e(),t.getAttribute("open")!==n&&d(t),r},c.element||(a(),i(),s(),o()),c.element&&!c.toggleEvent&&l())}.call(this),function(){}.call(this);