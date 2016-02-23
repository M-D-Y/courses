
// Продемонстрировать применение метода unread() из класса PushЬacltinputstream.
// В этой программе применяется оператор try с ресурсами.
// Требуется установка комплекта JDK, начиная с версии 7
import java.io.*;

class PushbackReaderDemo {
	public static void main(String args[]) {
		String s = "if(а==4)а=0;\n";
		char buf[] = new char[s.length()];
		s.getChars(0, s.length(), buf, 0);
		CharArrayReader in = new CharArrayReader(buf);
		int c;
		try (PushbackReader f = new PushbackReader(in)) {
			while ((c = f.read()) != -1) {
				switch (c) {
				case '=':
					if ((c = f.read()) == '=')
						System.out.print(".eq.");
					else {
						System.out.print("<-");
						f.unread(c);
					}
					break;
				default:
					System.out.print((char) c);
					break;
				}
			}
		} catch (IOException е) {
			System.out.println("Omибкa ввода-вывода: " + е);
		}
	}
}