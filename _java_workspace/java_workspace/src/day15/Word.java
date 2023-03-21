package day15;

import java.util.Objects;
import java.util.Scanner;

public class Word implements Comparable{
	private String word;
	private String mean;
	
	public Word(){}
	
	public Word(String word, String mean) {
		super();
		this.word = word;
		this.mean = mean;
	}


	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public String getMean() {
		return mean;
	}

	public void setMean(String mean) {
		this.mean = mean;
	}

	@Override
	public String toString() {
		return word + ":" + mean;
	}

	// 정렬하기 위해서
	
	@Override
	public int hashCode() {
		return Objects.hash(mean, word);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Word other = (Word) obj;
		if(word == null) {
			if(other.word != null) {
				return false;
			}
		}else if(!word.equals(other.word)) {
			return false;
		} 
		return true;
	
//		return Objects.equals(mean, other.mean) && Objects.equals(word, other.word);
	}

	@Override
	public int compareTo(Object o) {
		Word word = (Word)o;
		return this.word.compareTo(word.word);
	}
	
	
	
}
