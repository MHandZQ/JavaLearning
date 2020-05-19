package ZQ;

public class Main {
    public static void main(String[] args) {
        String[] fields = {"name", "position", "salary"};
        String table = "employee";
        String insert = buildInsertSql(table, fields);
        System.out.println(insert);
        String s = "INSERT INTO employee (name, position, salary) VALUES (?, ?, ?)";
        System.out.println(s.equals(insert) ? "测试成功" : "测试失败");
    }

    static String buildInsertSql(String table, String[] fields) {
        StringBuilder sb = new StringBuilder(1000);
        sb.append("INSERT INTO ")
                .append(table)
                .append(" (")
                .append(fields[0])
                .append(", ")
                .append(fields[1])
                .append(", ")
                .append(fields[2])
                .append(") ")
                .append("VALUES (?, ?, ?)");
        return sb.toString();
    }
}