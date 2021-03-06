package jammazwan.csv;

import java.io.Serializable;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

@CsvRecord(separator = ",", crlf = "UNIX", skipFirstLine=false)
public class SurnameCsv implements Serializable {
	private static final long serialVersionUID = -5497392637162931929L;
	@DataField(pos = 1)
	String name;

	public SurnameCsv() {
		super();
	}

	public SurnameCsv(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
