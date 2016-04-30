package org.campus02.socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Socket1Demo {

	public static void main(String[] args) throws UnknownHostException, IOException {

		Socket s1 = new Socket("news.orf.at", 80);
		BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(s1.getOutputStream()));
		BufferedReader rd = new BufferedReader(new InputStreamReader(s1.getInputStream()));

		wr.write("GET / HTTP/1.1 \r\nHost: news.orf.at\r\n\r\n");
		wr.flush();

		String line = "";
		while ((line = rd.readLine()) != null) {
			System.out.println(line);
		}

		s1.close();

	}
}
