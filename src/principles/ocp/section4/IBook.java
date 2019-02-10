package principles.ocp.section4;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 计书籍接口
 */
public interface IBook {

    //书籍有名称
    String getName();

    //书籍有售价
    int getPrice();

    //书籍有作者
    String getAuthor();
}
