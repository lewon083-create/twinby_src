package r7;

import android.os.Build;
import u7.j;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f32266e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(s7.d dVar, int i) {
        super(dVar);
        this.f32266e = i;
    }

    @Override // r7.c
    public final boolean a(j jVar) {
        switch (this.f32266e) {
            case 0:
                return jVar.f34338j.f28012b;
            case 1:
                return jVar.f34338j.f28014d;
            case 2:
                return jVar.f34338j.f28011a == 2;
            case 3:
                int i = jVar.f34338j.f28011a;
                return i == 3 || (Build.VERSION.SDK_INT >= 30 && i == 6);
            default:
                return jVar.f34338j.f28015e;
        }
    }

    @Override // r7.c
    public final boolean b(Object obj) {
        boolean zBooleanValue;
        switch (this.f32266e) {
            case 0:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
            case 1:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
            case 2:
                q7.a aVar = (q7.a) obj;
                return Build.VERSION.SDK_INT >= 26 ? (aVar.f31779a && aVar.f31780b) ? false : true : true ^ aVar.f31779a;
            case 3:
                q7.a aVar2 = (q7.a) obj;
                return !aVar2.f31779a || aVar2.f31781c;
            default:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
        }
        return !zBooleanValue;
    }
}
