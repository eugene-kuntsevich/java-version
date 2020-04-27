package main;

import knowledgebase.Knowledge;
import service.SoftwareDeveloper;

public class Owner
{
	public static void main(String[] args) {
		Knowledge knowledge = new Knowledge();
		SoftwareDeveloper developer = new SoftwareDeveloper(knowledge);

		String software = developer.develop("Хочу, чтобы было так и вот так");

		System.out.println(software);
	}
}
