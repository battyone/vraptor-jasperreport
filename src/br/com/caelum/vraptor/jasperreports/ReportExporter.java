package br.com.caelum.vraptor.jasperreports;

import br.com.caelum.vraptor.jasperreports.formats.ExportFormat;

/**
 * Generic report exporter
 *
 * @author William Pivotto
 *
 */

public interface ReportExporter {
	
	ReportExporter export(Report<?> report);
	byte[] to(ExportFormat format);

}
