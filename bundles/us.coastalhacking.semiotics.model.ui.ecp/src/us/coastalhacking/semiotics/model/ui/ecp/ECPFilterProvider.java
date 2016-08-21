/**
 * 
 */
package us.coastalhacking.semiotics.model.ui.ecp;

import java.util.HashSet;
import java.util.Set;

/**
 * @author jonpasski
 *
 */
public class ECPFilterProvider implements org.eclipse.emf.ecp.core.util.ECPFilterProvider {

	  // https://bugs.eclipse.org/bugs/show_bug.cgi?id=453329#c1
	  // Caused by: org.xml.sax.SAXParseExceptionpublicId:
	  // platform:/plugin/org.eclipse.emf.ecore.xcore.lib/model/XcoreLang.xcore;
	  // systemId:
	  // platform:/plugin/org.eclipse.emf.ecore.xcore.lib/model/XcoreLang.xcore;
	  // lineNumber: 1; columnNumber: 1; Content is not allowed in prolog.
	  @Override
	  public Set<String> getHiddenPackages() {
	    Set<String> results = new HashSet<>();
	    //results.add("xcore.lang");
	    // nsPrefix in comments
	    results.add("http://www.eclipse.org/emf/2011/Xcore"); // xcore
	    results.add("http://www.eclipse.org/xtext/builderstate/1.0"); // builderState
	    results.add("http://www.eclipse.org/xtext/codetemplate/Codetemplates"); // templates
	    results.add("http://www.eclipse.org/xtext/trace/debug/1.0"); // trace
	    results.add("http://www.eclipse.org/xtext/common/JavaVMTypes"); // types
	    results.add("http://www.eclipse.org/Xtext/Xbase/XAnnotations"); // xAnnotations
	    results.add("http://www.eclipse.org/xtext/xbase/Xbase"); // xbase
	    results.add("http://www.eclipse.org/2008/Xtext"); // xtext
	    results.add("http://www.eclipse.org/xtext/xbase/Xtype"); // xtype
	    return results;
	  }

}
