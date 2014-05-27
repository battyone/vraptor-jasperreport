package br.com.caelum.vraptor.jasperreports.formats;

import javax.enterprise.context.RequestScoped;

import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.export.JRTextExporter;
import net.sf.jasperreports.engine.export.JRTextExporterParameter;

/**
 * @author William Pivotto
 */

@RequestScoped
public class Txt extends AbstractExporter {

	public String getContentType() {
		return "text/plain";
	}

	public String getExtension() {
		return "txt";
	}
	
	public JRExporter setup() {
		configure(JRTextExporterParameter.CHARACTER_WIDTH, 5f);
		configure(JRTextExporterParameter.CHARACTER_HEIGHT, 20f);
		return new JRTextExporter();
	}
	
	public boolean supportsBatchMode() {
		return false;
	}

}
