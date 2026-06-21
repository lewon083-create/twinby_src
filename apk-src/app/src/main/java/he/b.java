package he;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements sb.d, sb.c, sb.b, OnCompleteListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CountDownLatch f20488c;

    public /* synthetic */ b(CountDownLatch countDownLatch) {
        this.f20487b = 1;
        this.f20488c = countDownLatch;
    }

    @Override // sb.b
    public void b() {
        switch (this.f20487b) {
            case 0:
                this.f20488c.countDown();
                break;
            default:
                this.f20488c.countDown();
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        this.f20488c.countDown();
    }

    @Override // sb.c
    public void onFailure(Exception exc) {
        switch (this.f20487b) {
            case 0:
                this.f20488c.countDown();
                break;
            default:
                this.f20488c.countDown();
                break;
        }
    }

    @Override // sb.d
    public void onSuccess(Object obj) {
        switch (this.f20487b) {
            case 0:
                this.f20488c.countDown();
                break;
            default:
                this.f20488c.countDown();
                break;
        }
    }

    public b(int i) {
        this.f20487b = i;
        switch (i) {
            case 2:
                this.f20488c = new CountDownLatch(1);
                break;
            default:
                this.f20488c = new CountDownLatch(1);
                break;
        }
    }
}
