package wi;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements OnCompleteListener, ii.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f35251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f35252c;

    public /* synthetic */ a(b bVar, int i) {
        this.f35251b = i;
        this.f35252c = bVar;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        switch (this.f35251b) {
            case 0:
                b bVar = this.f35252c;
                bVar.getClass();
                if (!task.isSuccessful()) {
                    bVar.c("status", "Failed to signout.");
                } else {
                    jh.b bVar2 = (jh.b) bVar.f35257f.f33319d;
                    Objects.requireNonNull(bVar2);
                    bVar2.d();
                    bVar.f35257f = null;
                }
                break;
            case 1:
                b bVar3 = this.f35252c;
                bVar3.getClass();
                if (!task.isSuccessful()) {
                    bVar3.c("status", "Failed to disconnect.");
                } else {
                    jh.b bVar4 = (jh.b) bVar3.f35257f.f33319d;
                    Objects.requireNonNull(bVar4);
                    bVar4.d();
                    bVar3.f35257f = null;
                }
                break;
            default:
                this.f35252c.h(task);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:91:0x0280  */
    @Override // ii.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void q(java.lang.Object r22, h3.e r23) {
        /*
            Method dump skipped, instruction units count: 928
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: wi.a.q(java.lang.Object, h3.e):void");
    }
}
