package pi;

import a0.i1;
import com.google.android.gms.internal.measurement.b4;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.ArrayList;
import java.util.HashMap;
import ni.x0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public interface j {
    static void a(ii.f fVar, final d dVar) {
        k kVar = k.f31503a;
        Object obj = null;
        s7.g gVar = new s7.g(fVar, "dev.flutter.pigeon.firebase_core_platform_interface.FirebaseCoreHostApi.initializeApp", kVar, obj);
        if (dVar != null) {
            final int i = 0;
            gVar.L(new ii.b(dVar) { // from class: pi.i

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ j f31502c;

                {
                    this.f31502c = dVar;
                }

                @Override // ii.b
                public final void q(Object obj2, h3.e eVar) {
                    switch (i) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = (ArrayList) obj2;
                            String str = (String) arrayList2.get(0);
                            e eVar2 = (e) arrayList2.get(1);
                            jh.b bVar = new jh.b(arrayList, eVar, 4);
                            d dVar2 = (d) this.f31502c;
                            dVar2.getClass();
                            sb.g gVar2 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new i1(dVar2, eVar2, str, gVar2, 13));
                            gVar2.f32858a.addOnCompleteListener(new x0(23, bVar));
                            break;
                        case 1:
                            jh.b bVar2 = new jh.b(new ArrayList(), eVar, 5);
                            final d dVar3 = (d) this.f31502c;
                            dVar3.getClass();
                            final sb.g gVar3 = new sb.g();
                            final int i10 = 1;
                            FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: pi.b
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ArrayList<fd.g> arrayList3;
                                    switch (i10) {
                                        case 0:
                                            d dVar4 = dVar3;
                                            sb.g gVar4 = gVar3;
                                            HashMap map = d.f31479d;
                                            dVar4.getClass();
                                            try {
                                                fd.i iVarA = fd.i.a(dVar4.f31480b);
                                                if (iVarA == null) {
                                                    gVar4.a(new Exception("Failed to load FirebaseOptions from resource. Check that you have defined values.xml correctly."));
                                                } else {
                                                    gVar4.b(d.c(iVarA));
                                                }
                                                return;
                                            } catch (Exception e3) {
                                                gVar4.a(e3);
                                                return;
                                            }
                                        default:
                                            d dVar5 = dVar3;
                                            sb.g gVar5 = gVar3;
                                            HashMap map2 = d.f31479d;
                                            dVar5.getClass();
                                            try {
                                                if (dVar5.f31481c) {
                                                    b4.b(FlutterFirebasePluginRegistry.didReinitializeFirebaseCore());
                                                } else {
                                                    dVar5.f31481c = true;
                                                }
                                                synchronized (fd.g.f16756k) {
                                                    arrayList3 = new ArrayList(fd.g.f16757l.values());
                                                    break;
                                                }
                                                ArrayList arrayList4 = new ArrayList(arrayList3.size());
                                                for (fd.g gVar6 : arrayList3) {
                                                    sb.g gVar7 = new sb.g();
                                                    FlutterFirebasePlugin.cachedThreadPool.execute(new c(dVar5, gVar6, gVar7));
                                                    arrayList4.add((f) b4.b(gVar7.f32858a));
                                                }
                                                gVar5.b(arrayList4);
                                                return;
                                            } catch (Exception e7) {
                                                gVar5.a(e7);
                                                return;
                                            }
                                    }
                                }
                            });
                            gVar3.f32858a.addOnCompleteListener(new x0(23, bVar2));
                            break;
                        default:
                            jh.b bVar3 = new jh.b(new ArrayList(), eVar, 6);
                            final d dVar4 = (d) this.f31502c;
                            dVar4.getClass();
                            final sb.g gVar4 = new sb.g();
                            final int i11 = 0;
                            FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: pi.b
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ArrayList<fd.g> arrayList3;
                                    switch (i11) {
                                        case 0:
                                            d dVar42 = dVar4;
                                            sb.g gVar42 = gVar4;
                                            HashMap map = d.f31479d;
                                            dVar42.getClass();
                                            try {
                                                fd.i iVarA = fd.i.a(dVar42.f31480b);
                                                if (iVarA == null) {
                                                    gVar42.a(new Exception("Failed to load FirebaseOptions from resource. Check that you have defined values.xml correctly."));
                                                } else {
                                                    gVar42.b(d.c(iVarA));
                                                }
                                                return;
                                            } catch (Exception e3) {
                                                gVar42.a(e3);
                                                return;
                                            }
                                        default:
                                            d dVar5 = dVar4;
                                            sb.g gVar5 = gVar4;
                                            HashMap map2 = d.f31479d;
                                            dVar5.getClass();
                                            try {
                                                if (dVar5.f31481c) {
                                                    b4.b(FlutterFirebasePluginRegistry.didReinitializeFirebaseCore());
                                                } else {
                                                    dVar5.f31481c = true;
                                                }
                                                synchronized (fd.g.f16756k) {
                                                    arrayList3 = new ArrayList(fd.g.f16757l.values());
                                                    break;
                                                }
                                                ArrayList arrayList4 = new ArrayList(arrayList3.size());
                                                for (fd.g gVar6 : arrayList3) {
                                                    sb.g gVar7 = new sb.g();
                                                    FlutterFirebasePlugin.cachedThreadPool.execute(new c(dVar5, gVar6, gVar7));
                                                    arrayList4.add((f) b4.b(gVar7.f32858a));
                                                }
                                                gVar5.b(arrayList4);
                                                return;
                                            } catch (Exception e7) {
                                                gVar5.a(e7);
                                                return;
                                            }
                                    }
                                }
                            });
                            gVar4.f32858a.addOnCompleteListener(new x0(23, bVar3));
                            break;
                    }
                }
            });
        } else {
            gVar.L(null);
        }
        s7.g gVar2 = new s7.g(fVar, "dev.flutter.pigeon.firebase_core_platform_interface.FirebaseCoreHostApi.initializeCore", kVar, obj);
        if (dVar != null) {
            final int i10 = 1;
            gVar2.L(new ii.b(dVar) { // from class: pi.i

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ j f31502c;

                {
                    this.f31502c = dVar;
                }

                @Override // ii.b
                public final void q(Object obj2, h3.e eVar) {
                    switch (i10) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = (ArrayList) obj2;
                            String str = (String) arrayList2.get(0);
                            e eVar2 = (e) arrayList2.get(1);
                            jh.b bVar = new jh.b(arrayList, eVar, 4);
                            d dVar2 = (d) this.f31502c;
                            dVar2.getClass();
                            sb.g gVar22 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new i1(dVar2, eVar2, str, gVar22, 13));
                            gVar22.f32858a.addOnCompleteListener(new x0(23, bVar));
                            break;
                        case 1:
                            jh.b bVar2 = new jh.b(new ArrayList(), eVar, 5);
                            final d dVar3 = (d) this.f31502c;
                            dVar3.getClass();
                            final sb.g gVar3 = new sb.g();
                            final int i102 = 1;
                            FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: pi.b
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ArrayList<fd.g> arrayList3;
                                    switch (i102) {
                                        case 0:
                                            d dVar42 = dVar3;
                                            sb.g gVar42 = gVar3;
                                            HashMap map = d.f31479d;
                                            dVar42.getClass();
                                            try {
                                                fd.i iVarA = fd.i.a(dVar42.f31480b);
                                                if (iVarA == null) {
                                                    gVar42.a(new Exception("Failed to load FirebaseOptions from resource. Check that you have defined values.xml correctly."));
                                                } else {
                                                    gVar42.b(d.c(iVarA));
                                                }
                                                return;
                                            } catch (Exception e3) {
                                                gVar42.a(e3);
                                                return;
                                            }
                                        default:
                                            d dVar5 = dVar3;
                                            sb.g gVar5 = gVar3;
                                            HashMap map2 = d.f31479d;
                                            dVar5.getClass();
                                            try {
                                                if (dVar5.f31481c) {
                                                    b4.b(FlutterFirebasePluginRegistry.didReinitializeFirebaseCore());
                                                } else {
                                                    dVar5.f31481c = true;
                                                }
                                                synchronized (fd.g.f16756k) {
                                                    arrayList3 = new ArrayList(fd.g.f16757l.values());
                                                    break;
                                                }
                                                ArrayList arrayList4 = new ArrayList(arrayList3.size());
                                                for (fd.g gVar6 : arrayList3) {
                                                    sb.g gVar7 = new sb.g();
                                                    FlutterFirebasePlugin.cachedThreadPool.execute(new c(dVar5, gVar6, gVar7));
                                                    arrayList4.add((f) b4.b(gVar7.f32858a));
                                                }
                                                gVar5.b(arrayList4);
                                                return;
                                            } catch (Exception e7) {
                                                gVar5.a(e7);
                                                return;
                                            }
                                    }
                                }
                            });
                            gVar3.f32858a.addOnCompleteListener(new x0(23, bVar2));
                            break;
                        default:
                            jh.b bVar3 = new jh.b(new ArrayList(), eVar, 6);
                            final d dVar4 = (d) this.f31502c;
                            dVar4.getClass();
                            final sb.g gVar4 = new sb.g();
                            final int i11 = 0;
                            FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: pi.b
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ArrayList<fd.g> arrayList3;
                                    switch (i11) {
                                        case 0:
                                            d dVar42 = dVar4;
                                            sb.g gVar42 = gVar4;
                                            HashMap map = d.f31479d;
                                            dVar42.getClass();
                                            try {
                                                fd.i iVarA = fd.i.a(dVar42.f31480b);
                                                if (iVarA == null) {
                                                    gVar42.a(new Exception("Failed to load FirebaseOptions from resource. Check that you have defined values.xml correctly."));
                                                } else {
                                                    gVar42.b(d.c(iVarA));
                                                }
                                                return;
                                            } catch (Exception e3) {
                                                gVar42.a(e3);
                                                return;
                                            }
                                        default:
                                            d dVar5 = dVar4;
                                            sb.g gVar5 = gVar4;
                                            HashMap map2 = d.f31479d;
                                            dVar5.getClass();
                                            try {
                                                if (dVar5.f31481c) {
                                                    b4.b(FlutterFirebasePluginRegistry.didReinitializeFirebaseCore());
                                                } else {
                                                    dVar5.f31481c = true;
                                                }
                                                synchronized (fd.g.f16756k) {
                                                    arrayList3 = new ArrayList(fd.g.f16757l.values());
                                                    break;
                                                }
                                                ArrayList arrayList4 = new ArrayList(arrayList3.size());
                                                for (fd.g gVar6 : arrayList3) {
                                                    sb.g gVar7 = new sb.g();
                                                    FlutterFirebasePlugin.cachedThreadPool.execute(new c(dVar5, gVar6, gVar7));
                                                    arrayList4.add((f) b4.b(gVar7.f32858a));
                                                }
                                                gVar5.b(arrayList4);
                                                return;
                                            } catch (Exception e7) {
                                                gVar5.a(e7);
                                                return;
                                            }
                                    }
                                }
                            });
                            gVar4.f32858a.addOnCompleteListener(new x0(23, bVar3));
                            break;
                    }
                }
            });
        } else {
            gVar2.L(null);
        }
        s7.g gVar3 = new s7.g(fVar, "dev.flutter.pigeon.firebase_core_platform_interface.FirebaseCoreHostApi.optionsFromResource", kVar, obj);
        if (dVar == null) {
            gVar3.L(null);
        } else {
            final int i11 = 2;
            gVar3.L(new ii.b(dVar) { // from class: pi.i

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ j f31502c;

                {
                    this.f31502c = dVar;
                }

                @Override // ii.b
                public final void q(Object obj2, h3.e eVar) {
                    switch (i11) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = (ArrayList) obj2;
                            String str = (String) arrayList2.get(0);
                            e eVar2 = (e) arrayList2.get(1);
                            jh.b bVar = new jh.b(arrayList, eVar, 4);
                            d dVar2 = (d) this.f31502c;
                            dVar2.getClass();
                            sb.g gVar22 = new sb.g();
                            FlutterFirebasePlugin.cachedThreadPool.execute(new i1(dVar2, eVar2, str, gVar22, 13));
                            gVar22.f32858a.addOnCompleteListener(new x0(23, bVar));
                            break;
                        case 1:
                            jh.b bVar2 = new jh.b(new ArrayList(), eVar, 5);
                            final d dVar3 = (d) this.f31502c;
                            dVar3.getClass();
                            final sb.g gVar32 = new sb.g();
                            final int i102 = 1;
                            FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: pi.b
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ArrayList<fd.g> arrayList3;
                                    switch (i102) {
                                        case 0:
                                            d dVar42 = dVar3;
                                            sb.g gVar42 = gVar32;
                                            HashMap map = d.f31479d;
                                            dVar42.getClass();
                                            try {
                                                fd.i iVarA = fd.i.a(dVar42.f31480b);
                                                if (iVarA == null) {
                                                    gVar42.a(new Exception("Failed to load FirebaseOptions from resource. Check that you have defined values.xml correctly."));
                                                } else {
                                                    gVar42.b(d.c(iVarA));
                                                }
                                                return;
                                            } catch (Exception e3) {
                                                gVar42.a(e3);
                                                return;
                                            }
                                        default:
                                            d dVar5 = dVar3;
                                            sb.g gVar5 = gVar32;
                                            HashMap map2 = d.f31479d;
                                            dVar5.getClass();
                                            try {
                                                if (dVar5.f31481c) {
                                                    b4.b(FlutterFirebasePluginRegistry.didReinitializeFirebaseCore());
                                                } else {
                                                    dVar5.f31481c = true;
                                                }
                                                synchronized (fd.g.f16756k) {
                                                    arrayList3 = new ArrayList(fd.g.f16757l.values());
                                                    break;
                                                }
                                                ArrayList arrayList4 = new ArrayList(arrayList3.size());
                                                for (fd.g gVar6 : arrayList3) {
                                                    sb.g gVar7 = new sb.g();
                                                    FlutterFirebasePlugin.cachedThreadPool.execute(new c(dVar5, gVar6, gVar7));
                                                    arrayList4.add((f) b4.b(gVar7.f32858a));
                                                }
                                                gVar5.b(arrayList4);
                                                return;
                                            } catch (Exception e7) {
                                                gVar5.a(e7);
                                                return;
                                            }
                                    }
                                }
                            });
                            gVar32.f32858a.addOnCompleteListener(new x0(23, bVar2));
                            break;
                        default:
                            jh.b bVar3 = new jh.b(new ArrayList(), eVar, 6);
                            final d dVar4 = (d) this.f31502c;
                            dVar4.getClass();
                            final sb.g gVar4 = new sb.g();
                            final int i112 = 0;
                            FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: pi.b
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ArrayList<fd.g> arrayList3;
                                    switch (i112) {
                                        case 0:
                                            d dVar42 = dVar4;
                                            sb.g gVar42 = gVar4;
                                            HashMap map = d.f31479d;
                                            dVar42.getClass();
                                            try {
                                                fd.i iVarA = fd.i.a(dVar42.f31480b);
                                                if (iVarA == null) {
                                                    gVar42.a(new Exception("Failed to load FirebaseOptions from resource. Check that you have defined values.xml correctly."));
                                                } else {
                                                    gVar42.b(d.c(iVarA));
                                                }
                                                return;
                                            } catch (Exception e3) {
                                                gVar42.a(e3);
                                                return;
                                            }
                                        default:
                                            d dVar5 = dVar4;
                                            sb.g gVar5 = gVar4;
                                            HashMap map2 = d.f31479d;
                                            dVar5.getClass();
                                            try {
                                                if (dVar5.f31481c) {
                                                    b4.b(FlutterFirebasePluginRegistry.didReinitializeFirebaseCore());
                                                } else {
                                                    dVar5.f31481c = true;
                                                }
                                                synchronized (fd.g.f16756k) {
                                                    arrayList3 = new ArrayList(fd.g.f16757l.values());
                                                    break;
                                                }
                                                ArrayList arrayList4 = new ArrayList(arrayList3.size());
                                                for (fd.g gVar6 : arrayList3) {
                                                    sb.g gVar7 = new sb.g();
                                                    FlutterFirebasePlugin.cachedThreadPool.execute(new c(dVar5, gVar6, gVar7));
                                                    arrayList4.add((f) b4.b(gVar7.f32858a));
                                                }
                                                gVar5.b(arrayList4);
                                                return;
                                            } catch (Exception e7) {
                                                gVar5.a(e7);
                                                return;
                                            }
                                    }
                                }
                            });
                            gVar4.f32858a.addOnCompleteListener(new x0(23, bVar3));
                            break;
                    }
                }
            });
        }
    }
}
