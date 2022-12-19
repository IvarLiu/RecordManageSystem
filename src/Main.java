import user.AdiminUser;
import user.NormalUser;
import user.User;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

import record.RecordList;

public class Main {
	public static User login() throws IOException {
		System.out.println("请输入姓名：");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		int choice = 0;
		String fileName = "./UserList.txt";
		Path path = Paths.get(fileName);
		List<String> allLines = Files.readAllLines(path, StandardCharsets.UTF_8);

		for (int i = 0; i < allLines.size(); i++) {
			if (name.equals(allLines.get(i))) {
				choice = Integer.parseInt(allLines.get(i + 1));
				String userType = choice == 1 ? "管理员用户" : "普通用户";
				System.out.println("找到用户" + name + ", 您是" + userType + "！");
				if (choice == 1) {
					return new AdiminUser(name);
				} else {
					return new NormalUser(name);
				}
			}
		}

		System.out.println("未找到用户，已新建用户" + name + "\n请选择用户类型：\n1. 管理员用户\n2. 普通用户");
		choice = scanner.nextInt();

		FileWriter fw = new FileWriter(fileName, true);
		fw.append("\n" + name + "\n" + choice);
		fw.close();

		if (choice == 1) {
			return new AdiminUser(name);
		} else {
			return new NormalUser(name);
		}

	}

	public static void main(String[] args) throws IOException {
		RecordList recordList = new RecordList();
		User user = login();
		while (true) {
			int choice = user.menu();
			user.doOperation(choice, recordList);

		}
	}
}
