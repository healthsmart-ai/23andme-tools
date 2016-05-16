package genepi.objects;

public class GenotypeLine {

	String rsid;
	String chromosome;
	int pos;
	String genotype;

	public GenotypeLine() {
	}

	public String getRsid() {
		return rsid;
	}

	public void setRsid(String rsid) {
		this.rsid = rsid;
	}

	public String getChromosome() {
		return chromosome;
	}

	public void setChromosome(String chromosome) {
		this.chromosome = chromosome;
	}

	public int getPos() {
		return pos;
	}

	public void setPos(int pos) {
		this.pos = pos;
	}

	public String getGenotype() {
		return genotype;
	}

	public void setGenotype(String genotype) {
		this.genotype = genotype;
	}

	public void parse(String line) {

		String[] splits = line.split("\t");
		this.rsid = splits[0];
		this.chromosome = splits[1];
		this.pos = Integer.valueOf(splits[2]);
		this.genotype = splits[3];

	}

}
