package oi;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.b4;
import com.google.firebase.messaging.FirebaseMessaging;
import d8.x;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.HashMap;
import java.util.concurrent.Executors;
import sb.m;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f30678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ sb.g f30679c;

    public /* synthetic */ f(int i, sb.g gVar) {
        this.f30678b = i;
        this.f30679c = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m mVarS;
        switch (this.f30678b) {
            case 0:
                sb.g gVar = this.f30679c;
                try {
                    gVar.b(new HashMap());
                } catch (Exception e3) {
                    gVar.a(e3);
                    return;
                }
                break;
            case 1:
                sb.g gVar2 = this.f30679c;
                try {
                    gVar2.b(null);
                } catch (Exception e7) {
                    gVar2.a(e7);
                    return;
                }
                break;
            case 2:
                FlutterFirebasePluginRegistry.lambda$didReinitializeFirebaseCore$1(this.f30679c);
                break;
            case 3:
                this.f30679c.b(null);
                break;
            case 4:
                sb.g gVar3 = this.f30679c;
                try {
                    final FirebaseMessaging firebaseMessagingC = FirebaseMessaging.c();
                    firebaseMessagingC.getClass();
                    final sb.g gVar4 = new sb.g();
                    final int i = 0;
                    firebaseMessagingC.f14770f.execute(new Runnable() { // from class: com.google.firebase.messaging.p
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i) {
                                case 0:
                                    FirebaseMessaging firebaseMessaging = firebaseMessagingC;
                                    sb.g gVar5 = gVar4;
                                    v7.f fVar = FirebaseMessaging.f14762l;
                                    try {
                                        gVar5.b(firebaseMessaging.a());
                                        return;
                                    } catch (Exception e10) {
                                        gVar5.a(e10);
                                        return;
                                    }
                                default:
                                    FirebaseMessaging firebaseMessaging2 = firebaseMessagingC;
                                    sb.g gVar6 = gVar4;
                                    v7.f fVar2 = FirebaseMessaging.f14762l;
                                    try {
                                        q9.o oVar = firebaseMessaging2.f14767c;
                                        oVar.getClass();
                                        Bundle bundle = new Bundle();
                                        bundle.putString("delete", "1");
                                        b4.b(oVar.j(oVar.p(ac.i.b((fd.g) oVar.f31946a), "*", bundle)));
                                        v7.f fVarD = FirebaseMessaging.d(firebaseMessaging2.f14766b);
                                        String strE = firebaseMessaging2.e();
                                        String strB = ac.i.b(firebaseMessaging2.f14765a);
                                        synchronized (fVarD) {
                                            String strM = v7.f.m(strE, strB);
                                            SharedPreferences.Editor editorEdit = ((SharedPreferences) fVarD.f34767c).edit();
                                            editorEdit.remove(strM);
                                            editorEdit.commit();
                                        }
                                        gVar6.b(null);
                                        return;
                                    } catch (Exception e11) {
                                        gVar6.a(e11);
                                        return;
                                    }
                            }
                        }
                    });
                    String str = (String) b4.b(gVar4.f32858a);
                    ki.a aVar = new ki.a();
                    aVar.put("token", str);
                    gVar3.b(aVar);
                } catch (Exception e10) {
                    gVar3.a(e10);
                    return;
                }
                break;
            default:
                sb.g gVar5 = this.f30679c;
                try {
                    final FirebaseMessaging firebaseMessagingC2 = FirebaseMessaging.c();
                    if (firebaseMessagingC2.f() == null) {
                        mVarS = b4.s(null);
                    } else {
                        final sb.g gVar6 = new sb.g();
                        final int i10 = 1;
                        Executors.newSingleThreadExecutor(new x("Firebase-Messaging-Network-Io", 2)).execute(new Runnable() { // from class: com.google.firebase.messaging.p
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i10) {
                                    case 0:
                                        FirebaseMessaging firebaseMessaging = firebaseMessagingC2;
                                        sb.g gVar52 = gVar6;
                                        v7.f fVar = FirebaseMessaging.f14762l;
                                        try {
                                            gVar52.b(firebaseMessaging.a());
                                            return;
                                        } catch (Exception e102) {
                                            gVar52.a(e102);
                                            return;
                                        }
                                    default:
                                        FirebaseMessaging firebaseMessaging2 = firebaseMessagingC2;
                                        sb.g gVar62 = gVar6;
                                        v7.f fVar2 = FirebaseMessaging.f14762l;
                                        try {
                                            q9.o oVar = firebaseMessaging2.f14767c;
                                            oVar.getClass();
                                            Bundle bundle = new Bundle();
                                            bundle.putString("delete", "1");
                                            b4.b(oVar.j(oVar.p(ac.i.b((fd.g) oVar.f31946a), "*", bundle)));
                                            v7.f fVarD = FirebaseMessaging.d(firebaseMessaging2.f14766b);
                                            String strE = firebaseMessaging2.e();
                                            String strB = ac.i.b(firebaseMessaging2.f14765a);
                                            synchronized (fVarD) {
                                                String strM = v7.f.m(strE, strB);
                                                SharedPreferences.Editor editorEdit = ((SharedPreferences) fVarD.f34767c).edit();
                                                editorEdit.remove(strM);
                                                editorEdit.commit();
                                            }
                                            gVar62.b(null);
                                            return;
                                        } catch (Exception e11) {
                                            gVar62.a(e11);
                                            return;
                                        }
                                }
                            }
                        });
                        mVarS = gVar6.f32858a;
                    }
                    b4.b(mVarS);
                    gVar5.b(null);
                } catch (Exception e11) {
                    gVar5.a(e11);
                }
                break;
        }
    }

    public /* synthetic */ f(ri.f fVar, sb.g gVar) {
        this.f30678b = 4;
        this.f30679c = gVar;
    }
}
