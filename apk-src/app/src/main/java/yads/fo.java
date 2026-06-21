package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class fo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jb2 f38503a;

    public fo(iw1 iw1Var) {
        this.f38503a = iw1Var;
        iw1Var.setId(2);
    }

    public void a(String str) {
        jb2 jb2Var = this.f38503a;
        jb2Var.loadDataWithBaseURL("https://yandex.ru", jb2Var.a(str), "text/html", "UTF-8", null);
    }
}
