/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.72
 * Generated at: 2023-04-01 17:59:17 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.site;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class layout2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("jar:file:/D:/java4/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/PolyAss/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153359882000L));
    _jspx_dependants.put("jar:file:/D:/java4/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/PolyAss/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153359882000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1679132148516L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta name=\"viewport\"\n");
      out.write("	content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("\n");
      out.write("<title>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${page.title}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</title>\n");
      out.write("<base href=\"/PolyAss/\"/>\n");
      out.write("<!-- style -->\n");
      out.write("<link rel=\"stylesheet\" href=\"./assets/css/bootstrap.css\" type=\"text/css\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"./assets/css/theme.css\" type=\"text/css\" />\n");
      out.write("</head>\n");
      out.write("<body class=\"layout-column\" id=\"fullscreen\">\n");
      out.write("	<header id=\"header\" class=\"page-header bg-white b-b\">\n");
      out.write("		<div class=\"navbar navbar-expand-lg\">\n");
      out.write("			<!-- brand -->\n");
      out.write("			<a href=\"home\" class=\"navbar-brand w w-auto-sm\"> <svg width=\"32\"\n");
      out.write("					height=\"32\" viewBox=\"0 0 512 512\"\n");
      out.write("					xmlns=\"http://www.w3.org/2000/svg\" fill=\"currentColor\">\n");
      out.write("                    <g class=\"loading-spin\"\n");
      out.write("						style=\"transform-origin: 256px 256px\">\n");
      out.write("                        <path\n");
      out.write("						d=\"M200.043 106.067c-40.631 15.171-73.434 46.382-90.717 85.933H256l-55.957-85.933zM412.797 288A160.723 160.723 0 0 0 416 256c0-36.624-12.314-70.367-33.016-97.334L311 288h101.797zM359.973 134.395C332.007 110.461 295.694 96 256 96c-7.966 0-15.794.591-23.448 1.715L310.852 224l49.121-89.605zM99.204 224A160.65 160.65 0 0 0 96 256c0 36.639 12.324 70.394 33.041 97.366L201 224H99.204zM311.959 405.932c40.631-15.171 73.433-46.382 90.715-85.932H256l55.959 85.932zM152.046 377.621C180.009 401.545 216.314 416 256 416c7.969 0 15.799-.592 23.456-1.716L201.164 288l-49.118 89.621z\">\n");
      out.write("                        </path>\n");
      out.write("                    </g>\n");
      out.write("                </svg><span\n");
      out.write("				class=\"hidden-folded d-inline l-s-n-1x w w-auto-sm\">POLYPHIM</span>\n");
      out.write("			</a>\n");
      out.write("			<!-- / brand -->\n");
      out.write("			<!-- Navbar collapse -->\n");
      out.write("			<div class=\"collapse navbar-collapse order-2 order-lg-1\"\n");
      out.write("				id=\"navbarToggler\">\n");
      out.write("				<form class=\"input-group m-2 my-lg-0 \">\n");
      out.write("					<div class=\"input-group-prepend\">\n");
      out.write("						<button type=\"button\"\n");
      out.write("							class=\"btn no-shadow no-bg px-0 text-inherit\">\n");
      out.write("							<i data-feather=\"search\"></i>\n");
      out.write("						</button>\n");
      out.write("					</div>\n");
      out.write("					<input type=\"text\"\n");
      out.write("						class=\"form-control no-border no-shadow no-bg typeahead\"\n");
      out.write("						placeholder=\"Tìm kiếm phim...\" data-plugin=\"typeahead\">\n");
      out.write("				</form>\n");
      out.write("			</div>\n");
      out.write("			<ul class=\"nav navbar-menu order-1 order-lg-2\">\n");
      out.write("				<li class=\"nav-item d-none d-sm-block\"><a class=\"nav-link px-2\"\n");
      out.write("					data-toggle=\"fullscreen\" data-plugin=\"fullscreen\"\n");
      out.write("					onclick=\"openFullscreen();\"> <i data-feather=\"maximize\"></i>\n");
      out.write("				</a></li>\n");
      out.write("\n");
      out.write("\n");
      out.write("				<!-- User dropdown menu -->\n");
      out.write("				");
      out.write("\n");
      out.write("					<li class=\"nav-item dropdown\">\n");
      out.write("              <a class=\"nav-link dropdown-toggle\" class=\"nav-link d-flex align-items-center px-2 text-color\" data-toggle=\"dropdown\" >\n");
      out.write("             \n");
      out.write("               \n");
      out.write("                    ");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write(" \n");
      out.write("                       ");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write(" \n");
      out.write("               </a>\n");
      out.write("              <div class=\"dropdown-menu dropdown-menu-right w mt-3 animate fadeIn\">\n");
      out.write("            ");
      if (_jspx_meth_c_005fif_005f2(_jspx_page_context))
        return;
      out.write(" \n");
      out.write("              ");
      if (_jspx_meth_c_005fif_005f3(_jspx_page_context))
        return;
      out.write("  \n");
      out.write("              </div>\n");
      out.write("            </li>\n");
      out.write("			</ul>\n");
      out.write("		</div>\n");
      out.write("	</header>\n");
      out.write("	<div id=\"main\" class=\"layout-row flex px-3\">\n");
      out.write("		<!-- ############ Aside START-->\n");
      out.write("		<div id=\"aside\"\n");
      out.write("			class=\"page-sidenav no-shrink bg-white b-r nav-dropdown fade\">\n");
      out.write("			<div class=\"sidenav h-100 modal-dialog bg-white b-r\">\n");
      out.write("				<!-- sidenav top -->\n");
      out.write("				<!-- Flex nav content -->\n");
      out.write("				<div class=\"flex scrollable hover\">\n");
      out.write("					<div class=\"nav-border b-primary\" data-nav>\n");
      out.write("						<ul class=\"nav bg\">\n");
      out.write("							<li class=\"nav-header hidden-folded\"><span\n");
      out.write("								class=\"text-muted\">Discover</span></li>\n");
      out.write("							<li><a href=\"home\" class=\"nav-text\"><span\n");
      out.write("									class=\"nav-icon\"><i data-feather=\"youtube\"></i></span>Browse</a></li>\n");
      out.write("							<li><a href=\"home\" class=\"nav-text\"><span\n");
      out.write("									class=\"nav-icon\"><i data-feather=\"film\"></i></span>Movies</a></li>\n");
      out.write("							<li><a href=\"home\" class=\"nav-text\"><span\n");
      out.write("									class=\"nav-icon\"><i data-feather=\"tv\"></i></span>TV shows</a></li>\n");
      out.write("							<li class=\"nav-header d-flex nav-fold\"><span\n");
      out.write("								class=\"py-2 text-muted hidden-folded\">Your Video</span></li>\n");
      out.write("							<li><a href=\"myfavorite\" class=\"nav-text\"><span\n");
      out.write("									class=\"nav-icon\"><i data-feather=\"bookmark\"></i></span>Bookmark</a></li>\n");
      out.write("							<li><a href=\"myfavorite\" class=\"nav-text\"><span\n");
      out.write("									class=\"nav-icon\"><i data-feather=\"heart\"></i></span>Liked\n");
      out.write("									videos</a></li>\n");
      out.write("							<li><a href=\"myfavorite\" class=\"nav-text\"><span\n");
      out.write("									class=\"nav-icon\"><i data-feather=\"star\"></i></span>My favorites</a></li>\n");
      out.write("							");
      if (_jspx_meth_c_005fif_005f4(_jspx_page_context))
        return;
      out.write("\n");
      out.write("						</ul>\n");
      out.write("					</div>\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("		</div>\n");
      out.write("		<div class=\"flex\">\n");
      out.write("			<!-- ############ Content START-->\n");
      out.write("			<div id=\"content\" class=\"\">\n");
      out.write("				<!-- ############ Main START-->\n");
      out.write("				<section>\n");
      out.write("					");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, (java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${page.contentUrl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null), out, false);
      out.write("\n");
      out.write("				</section>\n");
      out.write("				<!-- ############ Main END-->\n");
      out.write("			</div>\n");
      out.write("			<!-- ############ Content END-->\n");
      out.write("			<footer id=\"footer\" class=\"page-footer b-t\">\n");
      out.write("				<div class=\"page-container\">\n");
      out.write("					<div class=\"padding\">\n");
      out.write("						<div class=\"py-5 text-sm text-muted\">\n");
      out.write("							<div class=\"row\">\n");
      out.write("								<div class=\"col-12 col-sm-3\"></div>\n");
      out.write("								<div class=\"col-12 col-sm-9\">Copyright &copy; 2022\n");
      out.write("									NGHIENPHIM. All rights reserved.</div>\n");
      out.write("							</div>\n");
      out.write("						</div>\n");
      out.write("					</div>\n");
      out.write("				</div>\n");
      out.write("			</footer>\n");
      out.write("		</div>\n");
      out.write("	</div>\n");
      out.write("	<!-- jQuery first, then Popper.js, then Bootstrap JS -->\n");
      out.write("	<script src=\"./assets/js/jquery.min.js\"></script>\n");
      out.write("	<script src=\"./assets/js/popper.min.js\"></script>\n");
      out.write("	<script src=\"./assets/js/bootstrap.min.js\"></script>\n");
      out.write("	<!-- ajax page -->\n");
      out.write("	<script src=\"./assets/js/pjax.min.js\"></script>\n");
      out.write("	<script src=\"./assets/js/ajax.js\"></script>\n");
      out.write("	<!-- lazyload plugin -->\n");
      out.write("	<script src=\"./assets/js/lazyload.config.js\"></script>\n");
      out.write("	<script src=\"./assets/js/lazyload.js\"></script>\n");
      out.write("	<script src=\"./assets/js/plugin.js\"></script>\n");
      out.write("	<!-- scrollreveal -->\n");
      out.write("	<script src=\"./assets/js/scrollreveal.min.js\"></script>\n");
      out.write("	<!-- feathericon -->\n");
      out.write("	<script src=\"./assets/js/feather.min.js\"></script>\n");
      out.write("	<script src=\"./assets/js/plugins/feathericon.js\"></script>\n");
      out.write("	<!-- theme -->\n");
      out.write("	<script src=\"./assets/js/theme.js\"></script>\n");
      out.write("	<script src=\"./assets/js/utils.js\"></script>\n");
      out.write("	");
      if (_jspx_meth_c_005fif_005f5(_jspx_page_context))
        return;
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /site/layout2.jsp(89,20) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ ! isLogin }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write(" \n");
          out.write("                     <span>Tài Khoản </span>\n");
          out.write("                     ");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f1_reused = false;
    try {
      _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f1.setParent(null);
      // /site/layout2.jsp(92,23) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${isLogin }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
      if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write(" \n");
          out.write("                     <span  style=\"color: red; font-weight: bold;\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fullname }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</span>\n");
          out.write("                     ");
          int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      _jspx_th_c_005fif_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f2_reused = false;
    try {
      _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f2.setParent(null);
      // /site/layout2.jsp(97,12) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ ! isLogin }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
      if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write(" \n");
          out.write("                <a class=\"dropdown-item\" href=\"Login1\">Login</a>\n");
          out.write("                <a class=\"dropdown-item\" href=\"ForgotpasswordServlet\">Forgot Password</a>\n");
          out.write("                <a class=\"dropdown-item\" href=\"Registration\">Registration</a>\n");
          out.write("           ");
          int evalDoAfterBody = _jspx_th_c_005fif_005f2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
      _jspx_th_c_005fif_005f2_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f2, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f2_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f3(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f3_reused = false;
    try {
      _jspx_th_c_005fif_005f3.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f3.setParent(null);
      // /site/layout2.jsp(102,14) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${isLogin}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f3 = _jspx_th_c_005fif_005f3.doStartTag();
      if (_jspx_eval_c_005fif_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write(" \n");
          out.write("                <a class=\"dropdown-item\" href=\"Logoff\">Logoff</a>\n");
          out.write("                <a class=\"dropdown-item\" href=\"ChangepasswordServlet\">Change Password</a>\n");
          out.write("                <a class=\"dropdown-item\" href=\"EditprofileServlet\">Edit profile</a>\n");
          out.write("              ");
          int evalDoAfterBody = _jspx_th_c_005fif_005f3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f3);
      _jspx_th_c_005fif_005f3_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f3, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f3_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f4(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f4_reused = false;
    try {
      _jspx_th_c_005fif_005f4.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f4.setParent(null);
      // /site/layout2.jsp(139,7) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${isLogin}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f4 = _jspx_th_c_005fif_005f4.doStartTag();
      if (_jspx_eval_c_005fif_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("								<li><a href=\"admin/home\" class=\"nav-text\"><span\n");
          out.write("										class=\"nav-icon\"><i data-feather=\"command\"></i></span>Admin\n");
          out.write("										Management</a></li>\n");
          out.write("							");
          int evalDoAfterBody = _jspx_th_c_005fif_005f4.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f4);
      _jspx_th_c_005fif_005f4_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f4, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f4_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f5(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    javax.servlet.http.HttpServletRequest request = (javax.servlet.http.HttpServletRequest)_jspx_page_context.getRequest();
    javax.servlet.http.HttpServletResponse response = (javax.servlet.http.HttpServletResponse)_jspx_page_context.getResponse();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f5_reused = false;
    try {
      _jspx_th_c_005fif_005f5.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f5.setParent(null);
      // /site/layout2.jsp(193,1) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty page.scriptUrl}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f5 = _jspx_th_c_005fif_005f5.doStartTag();
      if (_jspx_eval_c_005fif_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write('\n');
          out.write('	');
          out.write('	');
          org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, (java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${page.scriptUrl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null), out, false);
          out.write('\n');
          out.write('	');
          int evalDoAfterBody = _jspx_th_c_005fif_005f5.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f5);
      _jspx_th_c_005fif_005f5_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f5, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f5_reused);
    }
    return false;
  }
}
