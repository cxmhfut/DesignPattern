package dp.template;

public abstract class Game {
    /**
     * 初始化游戏
     */
    protected abstract void initialize();

    /**
     * 开始游戏
     */
    protected abstract void startPlay();

    /**
     * 结束游戏
     */
    protected abstract void endPlay();

    //模板
    public final void play(){
        initialize();
        startPlay();
        endPlay();
    }
}
