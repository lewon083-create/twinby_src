package yads;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class jw3 extends AsyncTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public aw3 f40000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final iw3 f40001b;

    public jw3(iw3 iw3Var) {
        this.f40001b = iw3Var;
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        aw3 aw3Var = this.f40000a;
        if (aw3Var != null) {
            pw3 pw3Var = (pw3) aw3Var;
            pw3Var.f42094c = null;
            pw3Var.a();
        }
    }

    public final void a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
