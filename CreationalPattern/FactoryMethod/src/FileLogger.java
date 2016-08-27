/**
 * 具体产品
 * 它实现了抽象产品接口，某种类型的具体产品由专门的具体工厂创建，具体工厂和具体产品之间一一对应。
 * Author: markliu
 * Time  : 16-8-27 下午10:42
 */
public class FileLogger implements Logger {

	@Override
	public void writeLog() {
		System.out.println("文件方式记录日志");
	}
}
