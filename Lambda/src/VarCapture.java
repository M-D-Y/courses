//Пример захвата локальной переменной из объемлющей области действия
interface MyFunc_ {
	int func(int n);
}

class VarCapture {
	public static void main(String args[]) {
		// Локальная переменная, которая может быть захвачена
		int num = 10;
		MyFunc_ myLambda = (n) -> {
			// Такое применение переменной num допустимо, поскольку
			// она не видоизменяется
			int v = num + n;
			// Но следующая строка кода недопустима, поскольку в ней
			// предпринимается попытка видоизменить значение переменной num
			// nun++;
			return v;
		};
		// И следующая строка кода приведет к ошибке, поскольку в ней
		// нарушается действительно завершенное состояние переменной num
	// num=9;
	}
}