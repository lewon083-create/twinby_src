package ri;

import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.h5;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.n;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f32331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f32332c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sb.g f32333d;

    public /* synthetic */ d(Map map, sb.g gVar, int i) {
        this.f32331b = i;
        this.f32332c = map;
        this.f32333d = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f32331b) {
            case 0:
                Map map = this.f32332c;
                sb.g gVar = this.f32333d;
                try {
                    FirebaseMessaging firebaseMessagingC = FirebaseMessaging.c();
                    Object obj = map.get("topic");
                    Objects.requireNonNull(obj);
                    sb.m mVar = firebaseMessagingC.f14772h;
                    n nVar = new n((String) obj, 1);
                    mVar.getClass();
                    j0.f fVar = sb.h.f32859a;
                    sb.m mVar2 = new sb.m();
                    mVar.f32877b.p(new sb.k(fVar, nVar, mVar2));
                    mVar.p();
                    b4.b(mVar2);
                    gVar.b(null);
                } catch (Exception e3) {
                    gVar.a(e3);
                    return;
                }
                break;
            case 1:
                Map map2 = this.f32332c;
                sb.g gVar2 = this.f32333d;
                try {
                    FirebaseMessaging firebaseMessagingC2 = FirebaseMessaging.c();
                    Object obj2 = map2.get("enabled");
                    Objects.requireNonNull(obj2);
                    boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                    firebaseMessagingC2.getClass();
                    fd.g gVarE = fd.g.e();
                    gVarE.a();
                    gVarE.f16758a.getSharedPreferences("com.google.firebase.messaging", 0).edit().putBoolean("export_to_big_query", zBooleanValue).apply();
                    h5.z(firebaseMessagingC2.f14766b, firebaseMessagingC2.f14767c, firebaseMessagingC2.j());
                    gVar2.b(null);
                } catch (Exception e7) {
                    gVar2.a(e7);
                    return;
                }
                break;
            case 2:
                Map map3 = this.f32332c;
                sb.g gVar3 = this.f32333d;
                try {
                    FirebaseMessaging firebaseMessagingC3 = FirebaseMessaging.c();
                    Object obj3 = map3.get("enabled");
                    Objects.requireNonNull(obj3);
                    firebaseMessagingC3.i(((Boolean) obj3).booleanValue());
                    ki.a aVar = new ki.a();
                    aVar.put("isAutoInitEnabled", Boolean.valueOf(firebaseMessagingC3.f14769e.j()));
                    gVar3.b(aVar);
                } catch (Exception e10) {
                    gVar3.a(e10);
                    return;
                }
                break;
            case 3:
                Map map4 = this.f32332c;
                sb.g gVar4 = this.f32333d;
                try {
                    FirebaseMessaging firebaseMessagingC4 = FirebaseMessaging.c();
                    Object obj4 = map4.get("topic");
                    Objects.requireNonNull(obj4);
                    sb.m mVar3 = firebaseMessagingC4.f14772h;
                    n nVar2 = new n((String) obj4, 0);
                    mVar3.getClass();
                    j0.f fVar2 = sb.h.f32859a;
                    sb.m mVar4 = new sb.m();
                    mVar3.f32877b.p(new sb.k(fVar2, nVar2, mVar4));
                    mVar3.p();
                    b4.b(mVar4);
                    gVar4.b(null);
                } catch (Exception e11) {
                    gVar4.a(e11);
                    return;
                }
                break;
            default:
                Map map5 = this.f32332c;
                sb.g gVar5 = this.f32333d;
                try {
                    FirebaseMessaging.c().h(a0.e.j(map5));
                    gVar5.b(null);
                } catch (Exception e12) {
                    gVar5.a(e12);
                }
                break;
        }
    }

    public /* synthetic */ d(f fVar, Map map, sb.g gVar) {
        this.f32331b = 2;
        this.f32332c = map;
        this.f32333d = gVar;
    }
}
