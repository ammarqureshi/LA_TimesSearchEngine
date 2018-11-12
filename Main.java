package com.lucene.document;

import java.io.IOException;

import org.apache.lucene.queryparser.classic.ParseException;
import org.apache.lucene.search.similarities.BM25Similarity;
import org.apache.lucene.search.similarities.BooleanSimilarity;
import org.apache.lucene.search.similarities.ClassicSimilarity;
import org.apache.lucene.search.similarities.Similarity;
import org.apache.lucene.search.similarities.TFIDFSimilarity;

public class Main {

	public static void main(String...args) throws IOException {
		String workingDir = System.getProperty("user.dir");
		String indexStoreDir = workingDir.concat("/INDEX_DIR");
		//write
		LATimesIndexer indexWriter = new LATimesIndexer(indexStoreDir);
		indexWriter.indexDocs();	
		System.out.println("docs indexed");
	}

}
