package zi;

import android.content.Context;
import android.util.Log;
import h3.e;
import i0.o;
import ii.f;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.io.File;
import java.util.ArrayList;
import s7.g;
import t.t0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class d implements ei.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f46306b;

    public static void b(f fVar, final d dVar) {
        t0 t0VarA = fVar.a();
        b bVar = b.f46303a;
        g gVar = new g(fVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getTemporaryPath", bVar, t0VarA);
        if (dVar != null) {
            final int i = 0;
            gVar.L(new ii.b(dVar) { // from class: zi.a

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ d f46302c;

                {
                    this.f46302c = dVar;
                }

                @Override // ii.b
                public final void q(Object obj, e eVar) {
                    switch (i) {
                        case 0:
                            d dVar2 = this.f46302c;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, dVar2.f46306b.getCacheDir().getPath());
                            } catch (Throwable th2) {
                                arrayList = o.U(th2);
                            }
                            eVar.i(arrayList);
                            break;
                        case 1:
                            d dVar3 = this.f46302c;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = dVar3.f46306b;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(context.getDataDir().getPath(), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th3) {
                                arrayList2 = o.U(th3);
                            }
                            eVar.i(arrayList2);
                            break;
                        case 2:
                            d dVar4 = this.f46302c;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = dVar4.f46306b;
                                File dir = context2.getDir(PluginErrorDetails.Platform.FLUTTER, 0);
                                if (dir == null) {
                                    dir = new File(context2.getDataDir().getPath(), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th4) {
                                arrayList3 = o.U(th4);
                            }
                            eVar.i(arrayList3);
                            break;
                        case 3:
                            d dVar5 = this.f46302c;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, dVar5.f46306b.getCacheDir().getPath());
                            } catch (Throwable th5) {
                                arrayList4 = o.U(th5);
                            }
                            eVar.i(arrayList4);
                            break;
                        case 4:
                            d dVar6 = this.f46302c;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String absolutePath = null;
                                File externalFilesDir = dVar6.f46306b.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    absolutePath = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, absolutePath);
                            } catch (Throwable th6) {
                                arrayList5 = o.U(th6);
                            }
                            eVar.i(arrayList5);
                            break;
                        case 5:
                            d dVar7 = this.f46302c;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                dVar7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : dVar7.f46306b.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th7) {
                                arrayList6 = o.U(th7);
                            }
                            eVar.i(arrayList6);
                            break;
                        default:
                            d dVar8 = this.f46302c;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, dVar8.a((c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th8) {
                                arrayList8 = o.U(th8);
                            }
                            eVar.i(arrayList8);
                            break;
                    }
                }
            });
        } else {
            gVar.L(null);
        }
        g gVar2 = new g(fVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getApplicationSupportPath", bVar, t0VarA);
        if (dVar != null) {
            final int i10 = 1;
            gVar2.L(new ii.b(dVar) { // from class: zi.a

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ d f46302c;

                {
                    this.f46302c = dVar;
                }

                @Override // ii.b
                public final void q(Object obj, e eVar) {
                    switch (i10) {
                        case 0:
                            d dVar2 = this.f46302c;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, dVar2.f46306b.getCacheDir().getPath());
                            } catch (Throwable th2) {
                                arrayList = o.U(th2);
                            }
                            eVar.i(arrayList);
                            break;
                        case 1:
                            d dVar3 = this.f46302c;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = dVar3.f46306b;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(context.getDataDir().getPath(), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th3) {
                                arrayList2 = o.U(th3);
                            }
                            eVar.i(arrayList2);
                            break;
                        case 2:
                            d dVar4 = this.f46302c;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = dVar4.f46306b;
                                File dir = context2.getDir(PluginErrorDetails.Platform.FLUTTER, 0);
                                if (dir == null) {
                                    dir = new File(context2.getDataDir().getPath(), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th4) {
                                arrayList3 = o.U(th4);
                            }
                            eVar.i(arrayList3);
                            break;
                        case 3:
                            d dVar5 = this.f46302c;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, dVar5.f46306b.getCacheDir().getPath());
                            } catch (Throwable th5) {
                                arrayList4 = o.U(th5);
                            }
                            eVar.i(arrayList4);
                            break;
                        case 4:
                            d dVar6 = this.f46302c;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String absolutePath = null;
                                File externalFilesDir = dVar6.f46306b.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    absolutePath = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, absolutePath);
                            } catch (Throwable th6) {
                                arrayList5 = o.U(th6);
                            }
                            eVar.i(arrayList5);
                            break;
                        case 5:
                            d dVar7 = this.f46302c;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                dVar7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : dVar7.f46306b.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th7) {
                                arrayList6 = o.U(th7);
                            }
                            eVar.i(arrayList6);
                            break;
                        default:
                            d dVar8 = this.f46302c;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, dVar8.a((c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th8) {
                                arrayList8 = o.U(th8);
                            }
                            eVar.i(arrayList8);
                            break;
                    }
                }
            });
        } else {
            gVar2.L(null);
        }
        g gVar3 = new g(fVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getApplicationDocumentsPath", bVar, t0VarA);
        if (dVar != null) {
            final int i11 = 2;
            gVar3.L(new ii.b(dVar) { // from class: zi.a

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ d f46302c;

                {
                    this.f46302c = dVar;
                }

                @Override // ii.b
                public final void q(Object obj, e eVar) {
                    switch (i11) {
                        case 0:
                            d dVar2 = this.f46302c;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, dVar2.f46306b.getCacheDir().getPath());
                            } catch (Throwable th2) {
                                arrayList = o.U(th2);
                            }
                            eVar.i(arrayList);
                            break;
                        case 1:
                            d dVar3 = this.f46302c;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = dVar3.f46306b;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(context.getDataDir().getPath(), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th3) {
                                arrayList2 = o.U(th3);
                            }
                            eVar.i(arrayList2);
                            break;
                        case 2:
                            d dVar4 = this.f46302c;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = dVar4.f46306b;
                                File dir = context2.getDir(PluginErrorDetails.Platform.FLUTTER, 0);
                                if (dir == null) {
                                    dir = new File(context2.getDataDir().getPath(), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th4) {
                                arrayList3 = o.U(th4);
                            }
                            eVar.i(arrayList3);
                            break;
                        case 3:
                            d dVar5 = this.f46302c;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, dVar5.f46306b.getCacheDir().getPath());
                            } catch (Throwable th5) {
                                arrayList4 = o.U(th5);
                            }
                            eVar.i(arrayList4);
                            break;
                        case 4:
                            d dVar6 = this.f46302c;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String absolutePath = null;
                                File externalFilesDir = dVar6.f46306b.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    absolutePath = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, absolutePath);
                            } catch (Throwable th6) {
                                arrayList5 = o.U(th6);
                            }
                            eVar.i(arrayList5);
                            break;
                        case 5:
                            d dVar7 = this.f46302c;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                dVar7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : dVar7.f46306b.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th7) {
                                arrayList6 = o.U(th7);
                            }
                            eVar.i(arrayList6);
                            break;
                        default:
                            d dVar8 = this.f46302c;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, dVar8.a((c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th8) {
                                arrayList8 = o.U(th8);
                            }
                            eVar.i(arrayList8);
                            break;
                    }
                }
            });
        } else {
            gVar3.L(null);
        }
        g gVar4 = new g(fVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getApplicationCachePath", bVar, t0VarA);
        if (dVar != null) {
            final int i12 = 3;
            gVar4.L(new ii.b(dVar) { // from class: zi.a

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ d f46302c;

                {
                    this.f46302c = dVar;
                }

                @Override // ii.b
                public final void q(Object obj, e eVar) {
                    switch (i12) {
                        case 0:
                            d dVar2 = this.f46302c;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, dVar2.f46306b.getCacheDir().getPath());
                            } catch (Throwable th2) {
                                arrayList = o.U(th2);
                            }
                            eVar.i(arrayList);
                            break;
                        case 1:
                            d dVar3 = this.f46302c;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = dVar3.f46306b;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(context.getDataDir().getPath(), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th3) {
                                arrayList2 = o.U(th3);
                            }
                            eVar.i(arrayList2);
                            break;
                        case 2:
                            d dVar4 = this.f46302c;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = dVar4.f46306b;
                                File dir = context2.getDir(PluginErrorDetails.Platform.FLUTTER, 0);
                                if (dir == null) {
                                    dir = new File(context2.getDataDir().getPath(), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th4) {
                                arrayList3 = o.U(th4);
                            }
                            eVar.i(arrayList3);
                            break;
                        case 3:
                            d dVar5 = this.f46302c;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, dVar5.f46306b.getCacheDir().getPath());
                            } catch (Throwable th5) {
                                arrayList4 = o.U(th5);
                            }
                            eVar.i(arrayList4);
                            break;
                        case 4:
                            d dVar6 = this.f46302c;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String absolutePath = null;
                                File externalFilesDir = dVar6.f46306b.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    absolutePath = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, absolutePath);
                            } catch (Throwable th6) {
                                arrayList5 = o.U(th6);
                            }
                            eVar.i(arrayList5);
                            break;
                        case 5:
                            d dVar7 = this.f46302c;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                dVar7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : dVar7.f46306b.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th7) {
                                arrayList6 = o.U(th7);
                            }
                            eVar.i(arrayList6);
                            break;
                        default:
                            d dVar8 = this.f46302c;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, dVar8.a((c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th8) {
                                arrayList8 = o.U(th8);
                            }
                            eVar.i(arrayList8);
                            break;
                    }
                }
            });
        } else {
            gVar4.L(null);
        }
        g gVar5 = new g(fVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getExternalStoragePath", bVar, t0VarA);
        if (dVar != null) {
            final int i13 = 4;
            gVar5.L(new ii.b(dVar) { // from class: zi.a

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ d f46302c;

                {
                    this.f46302c = dVar;
                }

                @Override // ii.b
                public final void q(Object obj, e eVar) {
                    switch (i13) {
                        case 0:
                            d dVar2 = this.f46302c;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, dVar2.f46306b.getCacheDir().getPath());
                            } catch (Throwable th2) {
                                arrayList = o.U(th2);
                            }
                            eVar.i(arrayList);
                            break;
                        case 1:
                            d dVar3 = this.f46302c;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = dVar3.f46306b;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(context.getDataDir().getPath(), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th3) {
                                arrayList2 = o.U(th3);
                            }
                            eVar.i(arrayList2);
                            break;
                        case 2:
                            d dVar4 = this.f46302c;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = dVar4.f46306b;
                                File dir = context2.getDir(PluginErrorDetails.Platform.FLUTTER, 0);
                                if (dir == null) {
                                    dir = new File(context2.getDataDir().getPath(), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th4) {
                                arrayList3 = o.U(th4);
                            }
                            eVar.i(arrayList3);
                            break;
                        case 3:
                            d dVar5 = this.f46302c;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, dVar5.f46306b.getCacheDir().getPath());
                            } catch (Throwable th5) {
                                arrayList4 = o.U(th5);
                            }
                            eVar.i(arrayList4);
                            break;
                        case 4:
                            d dVar6 = this.f46302c;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String absolutePath = null;
                                File externalFilesDir = dVar6.f46306b.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    absolutePath = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, absolutePath);
                            } catch (Throwable th6) {
                                arrayList5 = o.U(th6);
                            }
                            eVar.i(arrayList5);
                            break;
                        case 5:
                            d dVar7 = this.f46302c;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                dVar7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : dVar7.f46306b.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th7) {
                                arrayList6 = o.U(th7);
                            }
                            eVar.i(arrayList6);
                            break;
                        default:
                            d dVar8 = this.f46302c;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, dVar8.a((c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th8) {
                                arrayList8 = o.U(th8);
                            }
                            eVar.i(arrayList8);
                            break;
                    }
                }
            });
        } else {
            gVar5.L(null);
        }
        g gVar6 = new g(fVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getExternalCachePaths", bVar, t0VarA);
        if (dVar != null) {
            final int i14 = 5;
            gVar6.L(new ii.b(dVar) { // from class: zi.a

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ d f46302c;

                {
                    this.f46302c = dVar;
                }

                @Override // ii.b
                public final void q(Object obj, e eVar) {
                    switch (i14) {
                        case 0:
                            d dVar2 = this.f46302c;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, dVar2.f46306b.getCacheDir().getPath());
                            } catch (Throwable th2) {
                                arrayList = o.U(th2);
                            }
                            eVar.i(arrayList);
                            break;
                        case 1:
                            d dVar3 = this.f46302c;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = dVar3.f46306b;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(context.getDataDir().getPath(), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th3) {
                                arrayList2 = o.U(th3);
                            }
                            eVar.i(arrayList2);
                            break;
                        case 2:
                            d dVar4 = this.f46302c;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = dVar4.f46306b;
                                File dir = context2.getDir(PluginErrorDetails.Platform.FLUTTER, 0);
                                if (dir == null) {
                                    dir = new File(context2.getDataDir().getPath(), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th4) {
                                arrayList3 = o.U(th4);
                            }
                            eVar.i(arrayList3);
                            break;
                        case 3:
                            d dVar5 = this.f46302c;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, dVar5.f46306b.getCacheDir().getPath());
                            } catch (Throwable th5) {
                                arrayList4 = o.U(th5);
                            }
                            eVar.i(arrayList4);
                            break;
                        case 4:
                            d dVar6 = this.f46302c;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String absolutePath = null;
                                File externalFilesDir = dVar6.f46306b.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    absolutePath = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, absolutePath);
                            } catch (Throwable th6) {
                                arrayList5 = o.U(th6);
                            }
                            eVar.i(arrayList5);
                            break;
                        case 5:
                            d dVar7 = this.f46302c;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                dVar7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : dVar7.f46306b.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th7) {
                                arrayList6 = o.U(th7);
                            }
                            eVar.i(arrayList6);
                            break;
                        default:
                            d dVar8 = this.f46302c;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, dVar8.a((c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th8) {
                                arrayList8 = o.U(th8);
                            }
                            eVar.i(arrayList8);
                            break;
                    }
                }
            });
        } else {
            gVar6.L(null);
        }
        g gVar7 = new g(fVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getExternalStoragePaths", bVar, t0VarA);
        if (dVar == null) {
            gVar7.L(null);
        } else {
            final int i15 = 6;
            gVar7.L(new ii.b(dVar) { // from class: zi.a

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ d f46302c;

                {
                    this.f46302c = dVar;
                }

                @Override // ii.b
                public final void q(Object obj, e eVar) {
                    switch (i15) {
                        case 0:
                            d dVar2 = this.f46302c;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, dVar2.f46306b.getCacheDir().getPath());
                            } catch (Throwable th2) {
                                arrayList = o.U(th2);
                            }
                            eVar.i(arrayList);
                            break;
                        case 1:
                            d dVar3 = this.f46302c;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = dVar3.f46306b;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(context.getDataDir().getPath(), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th3) {
                                arrayList2 = o.U(th3);
                            }
                            eVar.i(arrayList2);
                            break;
                        case 2:
                            d dVar4 = this.f46302c;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = dVar4.f46306b;
                                File dir = context2.getDir(PluginErrorDetails.Platform.FLUTTER, 0);
                                if (dir == null) {
                                    dir = new File(context2.getDataDir().getPath(), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th4) {
                                arrayList3 = o.U(th4);
                            }
                            eVar.i(arrayList3);
                            break;
                        case 3:
                            d dVar5 = this.f46302c;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, dVar5.f46306b.getCacheDir().getPath());
                            } catch (Throwable th5) {
                                arrayList4 = o.U(th5);
                            }
                            eVar.i(arrayList4);
                            break;
                        case 4:
                            d dVar6 = this.f46302c;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String absolutePath = null;
                                File externalFilesDir = dVar6.f46306b.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    absolutePath = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, absolutePath);
                            } catch (Throwable th6) {
                                arrayList5 = o.U(th6);
                            }
                            eVar.i(arrayList5);
                            break;
                        case 5:
                            d dVar7 = this.f46302c;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                dVar7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : dVar7.f46306b.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th7) {
                                arrayList6 = o.U(th7);
                            }
                            eVar.i(arrayList6);
                            break;
                        default:
                            d dVar8 = this.f46302c;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, dVar8.a((c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th8) {
                                arrayList8 = o.U(th8);
                            }
                            eVar.i(arrayList8);
                            break;
                    }
                }
            });
        }
    }

    public final ArrayList a(c cVar) {
        String str;
        ArrayList arrayList = new ArrayList();
        Context context = this.f46306b;
        switch (cVar) {
            case ROOT:
                str = null;
                break;
            case MUSIC:
                str = "music";
                break;
            case PODCASTS:
                str = "podcasts";
                break;
            case RINGTONES:
                str = "ringtones";
                break;
            case ALARMS:
                str = "alarms";
                break;
            case NOTIFICATIONS:
                str = "notifications";
                break;
            case PICTURES:
                str = "pictures";
                break;
            case MOVIES:
                str = "movies";
                break;
            case DOWNLOADS:
                str = "downloads";
                break;
            case DCIM:
                str = "dcim";
                break;
            case DOCUMENTS:
                str = "documents";
                break;
            default:
                throw new RuntimeException("Unrecognized directory: " + cVar);
        }
        for (File file : context.getExternalFilesDirs(str)) {
            if (file != null) {
                arrayList.add(file.getAbsolutePath());
            }
        }
        return arrayList;
    }

    @Override // ei.b
    public final void onAttachedToEngine(ei.a aVar) {
        f fVar = aVar.f16383c;
        Context context = aVar.f16381a;
        try {
            b(fVar, this);
        } catch (Exception e3) {
            Log.e("PathProviderPlugin", "Received exception while setting up PathProviderPlugin", e3);
        }
        this.f46306b = context;
    }

    @Override // ei.b
    public final void onDetachedFromEngine(ei.a aVar) {
        b(aVar.f16383c, null);
    }
}
