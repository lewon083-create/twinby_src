package pi;

import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import java.util.ArrayList;
import java.util.HashMap;
import m3.c0;
import ni.x0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public interface h {
    static void b(ii.f fVar, final d dVar) {
        k kVar = k.f31503a;
        Object obj = null;
        s7.g gVar = new s7.g(fVar, "dev.flutter.pigeon.firebase_core_platform_interface.FirebaseAppHostApi.setAutomaticDataCollectionEnabled", kVar, obj);
        if (dVar != null) {
            final int i = 0;
            gVar.L(new ii.b(dVar) { // from class: pi.g

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ h f31500c;

                {
                    this.f31500c = dVar;
                }

                @Override // ii.b
                public final void q(Object obj2, h3.e eVar) {
                    switch (i) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = (ArrayList) obj2;
                            final String str = (String) arrayList2.get(0);
                            final Boolean bool = (Boolean) arrayList2.get(1);
                            jh.b bVar = new jh.b(arrayList, eVar, 1);
                            ((d) this.f31500c).getClass();
                            final sb.g gVar2 = new sb.g();
                            final int i10 = 1;
                            FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: pi.a
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i11 = i10;
                                    sb.g gVar3 = gVar2;
                                    Boolean bool2 = bool;
                                    String str2 = str;
                                    switch (i11) {
                                        case 0:
                                            HashMap map = d.f31479d;
                                            try {
                                                fd.g gVarF = fd.g.f(str2);
                                                boolean zBooleanValue = bool2.booleanValue();
                                                gVarF.a();
                                                if (gVarF.f16762e.compareAndSet(!zBooleanValue, zBooleanValue)) {
                                                    boolean z5 = oa.c.f29825f.f29826b.get();
                                                    if (zBooleanValue && z5) {
                                                        gVarF.l(true);
                                                    } else if (!zBooleanValue && z5) {
                                                        gVarF.l(false);
                                                    }
                                                }
                                                gVar3.b(null);
                                            } catch (Exception e3) {
                                                gVar3.a(e3);
                                                return;
                                            }
                                            break;
                                        default:
                                            HashMap map2 = d.f31479d;
                                            try {
                                                fd.g.f(str2).m(bool2);
                                                gVar3.b(null);
                                            } catch (Exception e7) {
                                                gVar3.a(e7);
                                            }
                                            break;
                                    }
                                }
                            });
                            gVar2.f32858a.addOnCompleteListener(new x0(22, bVar));
                            break;
                        case 1:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            final String str2 = (String) arrayList4.get(0);
                            final Boolean bool2 = (Boolean) arrayList4.get(1);
                            jh.b bVar2 = new jh.b(arrayList3, eVar, 2);
                            ((d) this.f31500c).getClass();
                            final sb.g gVar3 = new sb.g();
                            final int i11 = 0;
                            FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: pi.a
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i112 = i11;
                                    sb.g gVar32 = gVar3;
                                    Boolean bool22 = bool2;
                                    String str22 = str2;
                                    switch (i112) {
                                        case 0:
                                            HashMap map = d.f31479d;
                                            try {
                                                fd.g gVarF = fd.g.f(str22);
                                                boolean zBooleanValue = bool22.booleanValue();
                                                gVarF.a();
                                                if (gVarF.f16762e.compareAndSet(!zBooleanValue, zBooleanValue)) {
                                                    boolean z5 = oa.c.f29825f.f29826b.get();
                                                    if (zBooleanValue && z5) {
                                                        gVarF.l(true);
                                                    } else if (!zBooleanValue && z5) {
                                                        gVarF.l(false);
                                                    }
                                                }
                                                gVar32.b(null);
                                            } catch (Exception e3) {
                                                gVar32.a(e3);
                                                return;
                                            }
                                            break;
                                        default:
                                            HashMap map2 = d.f31479d;
                                            try {
                                                fd.g.f(str22).m(bool22);
                                                gVar32.b(null);
                                            } catch (Exception e7) {
                                                gVar32.a(e7);
                                            }
                                            break;
                                    }
                                }
                            });
                            gVar3.f32858a.addOnCompleteListener(new x0(22, bVar2));
                            break;
                        default:
                            ArrayList arrayList5 = new ArrayList();
                            String str3 = (String) ((ArrayList) obj2).get(0);
                            jh.b bVar3 = new jh.b(arrayList5, eVar, 3);
                            ((d) this.f31500c).getClass();
                            sb.g gVar4 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new c0(13, str3, gVar4));
                            gVar4.f32858a.addOnCompleteListener(new x0(22, bVar3));
                            break;
                    }
                }
            });
        } else {
            gVar.L(null);
        }
        s7.g gVar2 = new s7.g(fVar, "dev.flutter.pigeon.firebase_core_platform_interface.FirebaseAppHostApi.setAutomaticResourceManagementEnabled", kVar, obj);
        if (dVar != null) {
            final int i10 = 1;
            gVar2.L(new ii.b(dVar) { // from class: pi.g

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ h f31500c;

                {
                    this.f31500c = dVar;
                }

                @Override // ii.b
                public final void q(Object obj2, h3.e eVar) {
                    switch (i10) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = (ArrayList) obj2;
                            final String str = (String) arrayList2.get(0);
                            final Boolean bool = (Boolean) arrayList2.get(1);
                            jh.b bVar = new jh.b(arrayList, eVar, 1);
                            ((d) this.f31500c).getClass();
                            final sb.g gVar22 = new sb.g();
                            final int i102 = 1;
                            FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: pi.a
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i112 = i102;
                                    sb.g gVar32 = gVar22;
                                    Boolean bool22 = bool;
                                    String str22 = str;
                                    switch (i112) {
                                        case 0:
                                            HashMap map = d.f31479d;
                                            try {
                                                fd.g gVarF = fd.g.f(str22);
                                                boolean zBooleanValue = bool22.booleanValue();
                                                gVarF.a();
                                                if (gVarF.f16762e.compareAndSet(!zBooleanValue, zBooleanValue)) {
                                                    boolean z5 = oa.c.f29825f.f29826b.get();
                                                    if (zBooleanValue && z5) {
                                                        gVarF.l(true);
                                                    } else if (!zBooleanValue && z5) {
                                                        gVarF.l(false);
                                                    }
                                                }
                                                gVar32.b(null);
                                            } catch (Exception e3) {
                                                gVar32.a(e3);
                                                return;
                                            }
                                            break;
                                        default:
                                            HashMap map2 = d.f31479d;
                                            try {
                                                fd.g.f(str22).m(bool22);
                                                gVar32.b(null);
                                            } catch (Exception e7) {
                                                gVar32.a(e7);
                                            }
                                            break;
                                    }
                                }
                            });
                            gVar22.f32858a.addOnCompleteListener(new x0(22, bVar));
                            break;
                        case 1:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            final String str2 = (String) arrayList4.get(0);
                            final Boolean bool2 = (Boolean) arrayList4.get(1);
                            jh.b bVar2 = new jh.b(arrayList3, eVar, 2);
                            ((d) this.f31500c).getClass();
                            final sb.g gVar3 = new sb.g();
                            final int i11 = 0;
                            FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: pi.a
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i112 = i11;
                                    sb.g gVar32 = gVar3;
                                    Boolean bool22 = bool2;
                                    String str22 = str2;
                                    switch (i112) {
                                        case 0:
                                            HashMap map = d.f31479d;
                                            try {
                                                fd.g gVarF = fd.g.f(str22);
                                                boolean zBooleanValue = bool22.booleanValue();
                                                gVarF.a();
                                                if (gVarF.f16762e.compareAndSet(!zBooleanValue, zBooleanValue)) {
                                                    boolean z5 = oa.c.f29825f.f29826b.get();
                                                    if (zBooleanValue && z5) {
                                                        gVarF.l(true);
                                                    } else if (!zBooleanValue && z5) {
                                                        gVarF.l(false);
                                                    }
                                                }
                                                gVar32.b(null);
                                            } catch (Exception e3) {
                                                gVar32.a(e3);
                                                return;
                                            }
                                            break;
                                        default:
                                            HashMap map2 = d.f31479d;
                                            try {
                                                fd.g.f(str22).m(bool22);
                                                gVar32.b(null);
                                            } catch (Exception e7) {
                                                gVar32.a(e7);
                                            }
                                            break;
                                    }
                                }
                            });
                            gVar3.f32858a.addOnCompleteListener(new x0(22, bVar2));
                            break;
                        default:
                            ArrayList arrayList5 = new ArrayList();
                            String str3 = (String) ((ArrayList) obj2).get(0);
                            jh.b bVar3 = new jh.b(arrayList5, eVar, 3);
                            ((d) this.f31500c).getClass();
                            sb.g gVar4 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new c0(13, str3, gVar4));
                            gVar4.f32858a.addOnCompleteListener(new x0(22, bVar3));
                            break;
                    }
                }
            });
        } else {
            gVar2.L(null);
        }
        s7.g gVar3 = new s7.g(fVar, "dev.flutter.pigeon.firebase_core_platform_interface.FirebaseAppHostApi.delete", kVar, obj);
        if (dVar == null) {
            gVar3.L(null);
        } else {
            final int i11 = 2;
            gVar3.L(new ii.b(dVar) { // from class: pi.g

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ h f31500c;

                {
                    this.f31500c = dVar;
                }

                @Override // ii.b
                public final void q(Object obj2, h3.e eVar) {
                    switch (i11) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = (ArrayList) obj2;
                            final String str = (String) arrayList2.get(0);
                            final Boolean bool = (Boolean) arrayList2.get(1);
                            jh.b bVar = new jh.b(arrayList, eVar, 1);
                            ((d) this.f31500c).getClass();
                            final sb.g gVar22 = new sb.g();
                            final int i102 = 1;
                            FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: pi.a
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i112 = i102;
                                    sb.g gVar32 = gVar22;
                                    Boolean bool22 = bool;
                                    String str22 = str;
                                    switch (i112) {
                                        case 0:
                                            HashMap map = d.f31479d;
                                            try {
                                                fd.g gVarF = fd.g.f(str22);
                                                boolean zBooleanValue = bool22.booleanValue();
                                                gVarF.a();
                                                if (gVarF.f16762e.compareAndSet(!zBooleanValue, zBooleanValue)) {
                                                    boolean z5 = oa.c.f29825f.f29826b.get();
                                                    if (zBooleanValue && z5) {
                                                        gVarF.l(true);
                                                    } else if (!zBooleanValue && z5) {
                                                        gVarF.l(false);
                                                    }
                                                }
                                                gVar32.b(null);
                                            } catch (Exception e3) {
                                                gVar32.a(e3);
                                                return;
                                            }
                                            break;
                                        default:
                                            HashMap map2 = d.f31479d;
                                            try {
                                                fd.g.f(str22).m(bool22);
                                                gVar32.b(null);
                                            } catch (Exception e7) {
                                                gVar32.a(e7);
                                            }
                                            break;
                                    }
                                }
                            });
                            gVar22.f32858a.addOnCompleteListener(new x0(22, bVar));
                            break;
                        case 1:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            final String str2 = (String) arrayList4.get(0);
                            final Boolean bool2 = (Boolean) arrayList4.get(1);
                            jh.b bVar2 = new jh.b(arrayList3, eVar, 2);
                            ((d) this.f31500c).getClass();
                            final sb.g gVar32 = new sb.g();
                            final int i112 = 0;
                            FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: pi.a
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i1122 = i112;
                                    sb.g gVar322 = gVar32;
                                    Boolean bool22 = bool2;
                                    String str22 = str2;
                                    switch (i1122) {
                                        case 0:
                                            HashMap map = d.f31479d;
                                            try {
                                                fd.g gVarF = fd.g.f(str22);
                                                boolean zBooleanValue = bool22.booleanValue();
                                                gVarF.a();
                                                if (gVarF.f16762e.compareAndSet(!zBooleanValue, zBooleanValue)) {
                                                    boolean z5 = oa.c.f29825f.f29826b.get();
                                                    if (zBooleanValue && z5) {
                                                        gVarF.l(true);
                                                    } else if (!zBooleanValue && z5) {
                                                        gVarF.l(false);
                                                    }
                                                }
                                                gVar322.b(null);
                                            } catch (Exception e3) {
                                                gVar322.a(e3);
                                                return;
                                            }
                                            break;
                                        default:
                                            HashMap map2 = d.f31479d;
                                            try {
                                                fd.g.f(str22).m(bool22);
                                                gVar322.b(null);
                                            } catch (Exception e7) {
                                                gVar322.a(e7);
                                            }
                                            break;
                                    }
                                }
                            });
                            gVar32.f32858a.addOnCompleteListener(new x0(22, bVar2));
                            break;
                        default:
                            ArrayList arrayList5 = new ArrayList();
                            String str3 = (String) ((ArrayList) obj2).get(0);
                            jh.b bVar3 = new jh.b(arrayList5, eVar, 3);
                            ((d) this.f31500c).getClass();
                            sb.g gVar4 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new c0(13, str3, gVar4));
                            gVar4.f32858a.addOnCompleteListener(new x0(22, bVar3));
                            break;
                    }
                }
            });
        }
    }
}
