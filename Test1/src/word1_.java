public class word1_ {
    public static void main(String[] args) {
        word1 r = new word1("《西游记》", "吴承恩", "787 mm*1092 mm", 544);
        System.out.println("书名:" + r.getName());
        System.out.println("作者:" + r.getWriter());
        System.out.println("尺寸:" + r.getSize());
        System.out.println("页数:" + r.getPage());
        r.road();

        word1 r1 = new word1("《水浒传》", "施耐庵", "787 mm*1092 mm", 1334);
        System.out.println("书名:" + r1.getName());
        System.out.println("作者:" + r1.getWriter());
        System.out.println("尺寸:" + r1.getSize());
        System.out.println("页数:" + r1.getPage());
        r1.road();

        word1 r2 = new word1("《三国演义》", "罗贯中", "787 mm*1092 mm", 959);
        System.out.println("书名:" + r2.getName());
        System.out.println("作者:" + r2.getWriter());
        System.out.println("尺寸:" + r2.getSize());
        System.out.println("页数:" + r2.getPage());
        r2.road();

        r.setName("《红楼梦》");
        r.setWriter("曹雪芹");
        r.setSize("787 mm*1092 mm");
        r.setPage(900);
        System.out.println("书名:" + r.getName());
        System.out.println("作者:" + r.getWriter());
        System.out.println("尺寸:" + r.getSize());
        System.out.println("页数:" + r.getPage());
        r.road();

        r1.setName("《周易》");
        r1.setWriter("殷商 佚名");
        System.out.println("书名:" + r1.getName());
        System.out.println("作者:" + r1.getWriter());
        r1.road();

        r2.setName("《道德经》");
        r2.setWriter("春秋 老子");
        System.out.println("书名:" + r2.getName());
        System.out.println("作者:" + r2.getWriter());
        r2.road();
    }
}
