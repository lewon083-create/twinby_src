package xi;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.ext.SdkExtensions;
import android.provider.MediaStore;
import io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference;
import io.sentry.rrweb.RRWebVideoEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import m.h3;
import t.t0;
import z2.w;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class i implements ei.b, fi.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ei.a f36235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h3 f36236c;

    public static void b(ii.f fVar, final i iVar) {
        t0 t0VarA = fVar.a();
        r rVar = r.f36256a;
        s7.g gVar = new s7.g(fVar, "dev.flutter.pigeon.image_picker_android.ImagePickerApi.pickImages", rVar, t0VarA);
        Object obj = null;
        if (iVar != null) {
            final int i = 0;
            gVar.L(new ii.b(iVar) { // from class: xi.o

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ i f36251c;

                {
                    this.f36251c = iVar;
                }

                @Override // ii.b
                public final void q(Object obj2, h3.e eVar) {
                    Intent intent;
                    Intent intent2;
                    Intent intent3;
                    Intent intent4;
                    Intent intent5;
                    switch (i) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = (ArrayList) obj2;
                            t tVar = (t) arrayList2.get(0);
                            p pVar = (p) arrayList2.get(1);
                            n nVar = (n) arrayList2.get(2);
                            jh.b bVar = new jh.b(arrayList, eVar, 13);
                            h3 h3Var = this.f36251c.f36236c;
                            g gVar2 = (h3Var == null || ((Activity) h3Var.f28251c) == null) ? null : (g) h3Var.f28252d;
                            if (gVar2 == null) {
                                bVar.c(new m("no_activity", "image_picker plugin requires a foreground activity."));
                                break;
                            } else {
                                Activity activity = gVar2.f36223c;
                                s sVar = tVar.f36260b;
                                if (sVar != null) {
                                    gVar2.f36229j = sVar.ordinal() != 1 ? 1 : 2;
                                }
                                boolean zBooleanValue = nVar.f36247a.booleanValue();
                                g.f mediaType = g.f.f19500a;
                                g.e eVar2 = g.e.f19499a;
                                int pickImagesMaxLimit = Integer.MAX_VALUE;
                                g.d dVar = g.d.f19498a;
                                if (zBooleanValue) {
                                    int iM = j0.g.M(nVar);
                                    boolean zBooleanValue2 = nVar.f36248b.booleanValue();
                                    if (!gVar2.m(pVar, null, bVar)) {
                                        g.c(bVar);
                                    } else {
                                        if (zBooleanValue2) {
                                            g.c cVar = new g.c(iM);
                                            int i10 = Build.VERSION.SDK_INT;
                                            int pickImagesMaxLimit2 = (i10 < 33 && (i10 < 30 || SdkExtensions.getExtensionVersion(30) < 2)) ? Integer.MAX_VALUE : MediaStore.getPickImagesMaxLimit();
                                            Intrinsics.checkNotNullParameter(mediaType, "mediaType");
                                            f.j jVar = new f.j();
                                            jVar.f16472a = eVar2;
                                            if (i10 >= 33 || (i10 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2)) {
                                                pickImagesMaxLimit = MediaStore.getPickImagesMaxLimit();
                                            }
                                            jVar.f16473b = pickImagesMaxLimit;
                                            jVar.f16474c = dVar;
                                            Intrinsics.checkNotNullParameter(mediaType, "<set-?>");
                                            jVar.f16472a = mediaType;
                                            jVar.f16473b = pickImagesMaxLimit2;
                                            Intrinsics.checkNotNullParameter(dVar, "<set-?>");
                                            jVar.f16474c = dVar;
                                            intent2 = cVar.a(activity, jVar);
                                        } else {
                                            intent2 = new Intent("android.intent.action.GET_CONTENT");
                                            intent2.setType("image/*");
                                            intent2.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                                        }
                                        activity.startActivityForResult(intent2, 2346);
                                    }
                                    break;
                                } else {
                                    int iOrdinal = tVar.f36259a.ordinal();
                                    if (iOrdinal == 0) {
                                        d dVar2 = gVar2.f36226f;
                                        if (!gVar2.m(pVar, null, bVar)) {
                                            g.c(bVar);
                                        } else if (gVar2.l() && t1.b.a((Activity) dVar2.f36218b, "android.permission.CAMERA") != 0) {
                                            t1.b.e((Activity) dVar2.f36218b, new String[]{"android.permission.CAMERA"}, 2345);
                                        } else {
                                            gVar2.j();
                                        }
                                        break;
                                    } else if (iOrdinal == 1) {
                                        boolean zBooleanValue3 = nVar.f36248b.booleanValue();
                                        if (!gVar2.m(pVar, null, bVar)) {
                                            g.c(bVar);
                                        } else {
                                            if (zBooleanValue3) {
                                                g.i iVar2 = new g.i(0);
                                                int i11 = Build.VERSION.SDK_INT;
                                                int pickImagesMaxLimit3 = (i11 < 33 && (i11 < 30 || SdkExtensions.getExtensionVersion(30) < 2)) ? Integer.MAX_VALUE : MediaStore.getPickImagesMaxLimit();
                                                Intrinsics.checkNotNullParameter(mediaType, "mediaType");
                                                f.j jVar2 = new f.j();
                                                jVar2.f16472a = eVar2;
                                                if (i11 >= 33 || (i11 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2)) {
                                                    pickImagesMaxLimit = MediaStore.getPickImagesMaxLimit();
                                                }
                                                jVar2.f16473b = pickImagesMaxLimit;
                                                jVar2.f16474c = dVar;
                                                Intrinsics.checkNotNullParameter(mediaType, "<set-?>");
                                                jVar2.f16472a = mediaType;
                                                jVar2.f16473b = pickImagesMaxLimit3;
                                                Intrinsics.checkNotNullParameter(dVar, "<set-?>");
                                                jVar2.f16474c = dVar;
                                                intent = iVar2.a(activity, jVar2);
                                            } else {
                                                intent = new Intent("android.intent.action.GET_CONTENT");
                                                intent.setType("image/*");
                                            }
                                            activity.startActivityForResult(intent, 2342);
                                        }
                                        break;
                                    }
                                }
                            }
                            break;
                        case 1:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            t tVar2 = (t) arrayList4.get(0);
                            v vVar = (v) arrayList4.get(1);
                            n nVar2 = (n) arrayList4.get(2);
                            jh.b bVar2 = new jh.b(arrayList3, eVar, 14);
                            h3 h3Var2 = this.f36251c.f36236c;
                            g gVar3 = (h3Var2 == null || ((Activity) h3Var2.f28251c) == null) ? null : (g) h3Var2.f28252d;
                            if (gVar3 == null) {
                                bVar2.c(new m("no_activity", "image_picker plugin requires a foreground activity."));
                                break;
                            } else {
                                Activity activity2 = gVar3.f36223c;
                                s sVar2 = tVar2.f36260b;
                                if (sVar2 != null) {
                                    gVar3.f36229j = sVar2.ordinal() != 1 ? 1 : 2;
                                }
                                boolean zBooleanValue4 = nVar2.f36247a.booleanValue();
                                g.g mediaType2 = g.g.f19501a;
                                g.e eVar3 = g.e.f19499a;
                                int pickImagesMaxLimit4 = Integer.MAX_VALUE;
                                g.d dVar3 = g.d.f19498a;
                                if (zBooleanValue4) {
                                    int iM2 = j0.g.M(nVar2);
                                    boolean zBooleanValue5 = nVar2.f36248b.booleanValue();
                                    if (!gVar3.m(null, vVar, bVar2)) {
                                        g.c(bVar2);
                                    } else {
                                        if (zBooleanValue5) {
                                            g.c cVar2 = new g.c(iM2);
                                            int i12 = Build.VERSION.SDK_INT;
                                            int pickImagesMaxLimit5 = (i12 < 33 && (i12 < 30 || SdkExtensions.getExtensionVersion(30) < 2)) ? Integer.MAX_VALUE : MediaStore.getPickImagesMaxLimit();
                                            Intrinsics.checkNotNullParameter(mediaType2, "mediaType");
                                            f.j jVar3 = new f.j();
                                            jVar3.f16472a = eVar3;
                                            if (i12 >= 33 || (i12 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2)) {
                                                pickImagesMaxLimit4 = MediaStore.getPickImagesMaxLimit();
                                            }
                                            jVar3.f16473b = pickImagesMaxLimit4;
                                            jVar3.f16474c = dVar3;
                                            Intrinsics.checkNotNullParameter(mediaType2, "<set-?>");
                                            jVar3.f16472a = mediaType2;
                                            jVar3.f16473b = pickImagesMaxLimit5;
                                            Intrinsics.checkNotNullParameter(dVar3, "<set-?>");
                                            jVar3.f16474c = dVar3;
                                            intent4 = cVar2.a(activity2, jVar3);
                                        } else {
                                            intent4 = new Intent("android.intent.action.GET_CONTENT");
                                            intent4.setType("video/*");
                                            intent4.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                                        }
                                        activity2.startActivityForResult(intent4, 2348);
                                    }
                                    break;
                                } else {
                                    int iOrdinal2 = tVar2.f36259a.ordinal();
                                    if (iOrdinal2 == 0) {
                                        d dVar4 = gVar3.f36226f;
                                        if (!gVar3.m(null, vVar, bVar2)) {
                                            g.c(bVar2);
                                        } else if (gVar3.l() && t1.b.a((Activity) dVar4.f36218b, "android.permission.CAMERA") != 0) {
                                            t1.b.e((Activity) dVar4.f36218b, new String[]{"android.permission.CAMERA"}, 2355);
                                        } else {
                                            gVar3.k();
                                        }
                                        break;
                                    } else if (iOrdinal2 == 1) {
                                        boolean zBooleanValue6 = nVar2.f36248b.booleanValue();
                                        if (!gVar3.m(null, vVar, bVar2)) {
                                            g.c(bVar2);
                                        } else {
                                            if (zBooleanValue6) {
                                                g.i iVar3 = new g.i(0);
                                                int i13 = Build.VERSION.SDK_INT;
                                                int pickImagesMaxLimit6 = (i13 < 33 && (i13 < 30 || SdkExtensions.getExtensionVersion(30) < 2)) ? Integer.MAX_VALUE : MediaStore.getPickImagesMaxLimit();
                                                Intrinsics.checkNotNullParameter(mediaType2, "mediaType");
                                                f.j jVar4 = new f.j();
                                                jVar4.f16472a = eVar3;
                                                if (i13 >= 33 || (i13 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2)) {
                                                    pickImagesMaxLimit4 = MediaStore.getPickImagesMaxLimit();
                                                }
                                                jVar4.f16473b = pickImagesMaxLimit4;
                                                jVar4.f16474c = dVar3;
                                                Intrinsics.checkNotNullParameter(mediaType2, "<set-?>");
                                                jVar4.f16472a = mediaType2;
                                                jVar4.f16473b = pickImagesMaxLimit6;
                                                Intrinsics.checkNotNullParameter(dVar3, "<set-?>");
                                                jVar4.f16474c = dVar3;
                                                intent3 = iVar3.a(activity2, jVar4);
                                            } else {
                                                intent3 = new Intent("android.intent.action.GET_CONTENT");
                                                intent3.setType("video/*");
                                            }
                                            activity2.startActivityForResult(intent3, 2352);
                                        }
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = (ArrayList) obj2;
                            q qVar = (q) arrayList6.get(0);
                            n nVar3 = (n) arrayList6.get(1);
                            jh.b bVar3 = new jh.b(arrayList5, eVar, 15);
                            h3 h3Var3 = this.f36251c.f36236c;
                            g gVar4 = (h3Var3 == null || ((Activity) h3Var3.f28251c) == null) ? null : (g) h3Var3.f28252d;
                            if (gVar4 == null) {
                                bVar3.c(new m("no_activity", "image_picker plugin requires a foreground activity."));
                            } else if (!gVar4.m(qVar.f36255a, null, bVar3)) {
                                g.c(bVar3);
                            } else {
                                Activity activity3 = gVar4.f36223c;
                                if (nVar3.f36248b.booleanValue()) {
                                    boolean zBooleanValue7 = nVar3.f36247a.booleanValue();
                                    g.d dVar5 = g.d.f19498a;
                                    int pickImagesMaxLimit7 = Integer.MAX_VALUE;
                                    g.e mediaType3 = g.e.f19499a;
                                    if (zBooleanValue7) {
                                        g.c cVar3 = new g.c(j0.g.M(nVar3));
                                        int i14 = Build.VERSION.SDK_INT;
                                        int pickImagesMaxLimit8 = (i14 < 33 && (i14 < 30 || SdkExtensions.getExtensionVersion(30) < 2)) ? Integer.MAX_VALUE : MediaStore.getPickImagesMaxLimit();
                                        Intrinsics.checkNotNullParameter(mediaType3, "mediaType");
                                        f.j jVar5 = new f.j();
                                        jVar5.f16472a = mediaType3;
                                        if (i14 >= 33 || (i14 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2)) {
                                            pickImagesMaxLimit7 = MediaStore.getPickImagesMaxLimit();
                                        }
                                        jVar5.f16473b = pickImagesMaxLimit7;
                                        jVar5.f16474c = dVar5;
                                        Intrinsics.checkNotNullParameter(mediaType3, "<set-?>");
                                        jVar5.f16472a = mediaType3;
                                        jVar5.f16473b = pickImagesMaxLimit8;
                                        Intrinsics.checkNotNullParameter(dVar5, "<set-?>");
                                        jVar5.f16474c = dVar5;
                                        intent5 = cVar3.a(activity3, jVar5);
                                    } else {
                                        g.i iVar4 = new g.i(0);
                                        int i15 = Build.VERSION.SDK_INT;
                                        int pickImagesMaxLimit9 = (i15 < 33 && (i15 < 30 || SdkExtensions.getExtensionVersion(30) < 2)) ? Integer.MAX_VALUE : MediaStore.getPickImagesMaxLimit();
                                        Intrinsics.checkNotNullParameter(mediaType3, "mediaType");
                                        f.j jVar6 = new f.j();
                                        jVar6.f16472a = mediaType3;
                                        if (i15 >= 33 || (i15 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2)) {
                                            pickImagesMaxLimit7 = MediaStore.getPickImagesMaxLimit();
                                        }
                                        jVar6.f16473b = pickImagesMaxLimit7;
                                        jVar6.f16474c = dVar5;
                                        Intrinsics.checkNotNullParameter(mediaType3, "<set-?>");
                                        jVar6.f16472a = mediaType3;
                                        jVar6.f16473b = pickImagesMaxLimit9;
                                        Intrinsics.checkNotNullParameter(dVar5, "<set-?>");
                                        jVar6.f16474c = dVar5;
                                        intent5 = iVar4.a(activity3, jVar6);
                                    }
                                } else {
                                    intent5 = new Intent("android.intent.action.GET_CONTENT");
                                    intent5.setType("*/*");
                                    intent5.putExtra("CONTENT_TYPE", new String[]{"video/*", "image/*"});
                                    intent5.putExtra("android.intent.extra.ALLOW_MULTIPLE", nVar3.f36247a);
                                }
                                activity3.startActivityForResult(intent5, 2347);
                            }
                            break;
                        default:
                            i iVar5 = this.f36251c;
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                arrayList7.add(0, iVar5.a());
                            } catch (Throwable th2) {
                                arrayList7 = k3.f.K(th2);
                            }
                            eVar.i(arrayList7);
                            break;
                    }
                }
            });
        } else {
            gVar.L(null);
        }
        s7.g gVar2 = new s7.g(fVar, "dev.flutter.pigeon.image_picker_android.ImagePickerApi.pickVideos", rVar, t0VarA);
        if (iVar != null) {
            final int i10 = 1;
            gVar2.L(new ii.b(iVar) { // from class: xi.o

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ i f36251c;

                {
                    this.f36251c = iVar;
                }

                @Override // ii.b
                public final void q(Object obj2, h3.e eVar) {
                    Intent intent;
                    Intent intent2;
                    Intent intent3;
                    Intent intent4;
                    Intent intent5;
                    switch (i10) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = (ArrayList) obj2;
                            t tVar = (t) arrayList2.get(0);
                            p pVar = (p) arrayList2.get(1);
                            n nVar = (n) arrayList2.get(2);
                            jh.b bVar = new jh.b(arrayList, eVar, 13);
                            h3 h3Var = this.f36251c.f36236c;
                            g gVar22 = (h3Var == null || ((Activity) h3Var.f28251c) == null) ? null : (g) h3Var.f28252d;
                            if (gVar22 == null) {
                                bVar.c(new m("no_activity", "image_picker plugin requires a foreground activity."));
                                break;
                            } else {
                                Activity activity = gVar22.f36223c;
                                s sVar = tVar.f36260b;
                                if (sVar != null) {
                                    gVar22.f36229j = sVar.ordinal() != 1 ? 1 : 2;
                                }
                                boolean zBooleanValue = nVar.f36247a.booleanValue();
                                g.f mediaType = g.f.f19500a;
                                g.e eVar2 = g.e.f19499a;
                                int pickImagesMaxLimit = Integer.MAX_VALUE;
                                g.d dVar = g.d.f19498a;
                                if (zBooleanValue) {
                                    int iM = j0.g.M(nVar);
                                    boolean zBooleanValue2 = nVar.f36248b.booleanValue();
                                    if (!gVar22.m(pVar, null, bVar)) {
                                        g.c(bVar);
                                    } else {
                                        if (zBooleanValue2) {
                                            g.c cVar = new g.c(iM);
                                            int i102 = Build.VERSION.SDK_INT;
                                            int pickImagesMaxLimit2 = (i102 < 33 && (i102 < 30 || SdkExtensions.getExtensionVersion(30) < 2)) ? Integer.MAX_VALUE : MediaStore.getPickImagesMaxLimit();
                                            Intrinsics.checkNotNullParameter(mediaType, "mediaType");
                                            f.j jVar = new f.j();
                                            jVar.f16472a = eVar2;
                                            if (i102 >= 33 || (i102 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2)) {
                                                pickImagesMaxLimit = MediaStore.getPickImagesMaxLimit();
                                            }
                                            jVar.f16473b = pickImagesMaxLimit;
                                            jVar.f16474c = dVar;
                                            Intrinsics.checkNotNullParameter(mediaType, "<set-?>");
                                            jVar.f16472a = mediaType;
                                            jVar.f16473b = pickImagesMaxLimit2;
                                            Intrinsics.checkNotNullParameter(dVar, "<set-?>");
                                            jVar.f16474c = dVar;
                                            intent2 = cVar.a(activity, jVar);
                                        } else {
                                            intent2 = new Intent("android.intent.action.GET_CONTENT");
                                            intent2.setType("image/*");
                                            intent2.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                                        }
                                        activity.startActivityForResult(intent2, 2346);
                                    }
                                    break;
                                } else {
                                    int iOrdinal = tVar.f36259a.ordinal();
                                    if (iOrdinal == 0) {
                                        d dVar2 = gVar22.f36226f;
                                        if (!gVar22.m(pVar, null, bVar)) {
                                            g.c(bVar);
                                        } else if (gVar22.l() && t1.b.a((Activity) dVar2.f36218b, "android.permission.CAMERA") != 0) {
                                            t1.b.e((Activity) dVar2.f36218b, new String[]{"android.permission.CAMERA"}, 2345);
                                        } else {
                                            gVar22.j();
                                        }
                                        break;
                                    } else if (iOrdinal == 1) {
                                        boolean zBooleanValue3 = nVar.f36248b.booleanValue();
                                        if (!gVar22.m(pVar, null, bVar)) {
                                            g.c(bVar);
                                        } else {
                                            if (zBooleanValue3) {
                                                g.i iVar2 = new g.i(0);
                                                int i11 = Build.VERSION.SDK_INT;
                                                int pickImagesMaxLimit3 = (i11 < 33 && (i11 < 30 || SdkExtensions.getExtensionVersion(30) < 2)) ? Integer.MAX_VALUE : MediaStore.getPickImagesMaxLimit();
                                                Intrinsics.checkNotNullParameter(mediaType, "mediaType");
                                                f.j jVar2 = new f.j();
                                                jVar2.f16472a = eVar2;
                                                if (i11 >= 33 || (i11 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2)) {
                                                    pickImagesMaxLimit = MediaStore.getPickImagesMaxLimit();
                                                }
                                                jVar2.f16473b = pickImagesMaxLimit;
                                                jVar2.f16474c = dVar;
                                                Intrinsics.checkNotNullParameter(mediaType, "<set-?>");
                                                jVar2.f16472a = mediaType;
                                                jVar2.f16473b = pickImagesMaxLimit3;
                                                Intrinsics.checkNotNullParameter(dVar, "<set-?>");
                                                jVar2.f16474c = dVar;
                                                intent = iVar2.a(activity, jVar2);
                                            } else {
                                                intent = new Intent("android.intent.action.GET_CONTENT");
                                                intent.setType("image/*");
                                            }
                                            activity.startActivityForResult(intent, 2342);
                                        }
                                        break;
                                    }
                                }
                            }
                            break;
                        case 1:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            t tVar2 = (t) arrayList4.get(0);
                            v vVar = (v) arrayList4.get(1);
                            n nVar2 = (n) arrayList4.get(2);
                            jh.b bVar2 = new jh.b(arrayList3, eVar, 14);
                            h3 h3Var2 = this.f36251c.f36236c;
                            g gVar3 = (h3Var2 == null || ((Activity) h3Var2.f28251c) == null) ? null : (g) h3Var2.f28252d;
                            if (gVar3 == null) {
                                bVar2.c(new m("no_activity", "image_picker plugin requires a foreground activity."));
                                break;
                            } else {
                                Activity activity2 = gVar3.f36223c;
                                s sVar2 = tVar2.f36260b;
                                if (sVar2 != null) {
                                    gVar3.f36229j = sVar2.ordinal() != 1 ? 1 : 2;
                                }
                                boolean zBooleanValue4 = nVar2.f36247a.booleanValue();
                                g.g mediaType2 = g.g.f19501a;
                                g.e eVar3 = g.e.f19499a;
                                int pickImagesMaxLimit4 = Integer.MAX_VALUE;
                                g.d dVar3 = g.d.f19498a;
                                if (zBooleanValue4) {
                                    int iM2 = j0.g.M(nVar2);
                                    boolean zBooleanValue5 = nVar2.f36248b.booleanValue();
                                    if (!gVar3.m(null, vVar, bVar2)) {
                                        g.c(bVar2);
                                    } else {
                                        if (zBooleanValue5) {
                                            g.c cVar2 = new g.c(iM2);
                                            int i12 = Build.VERSION.SDK_INT;
                                            int pickImagesMaxLimit5 = (i12 < 33 && (i12 < 30 || SdkExtensions.getExtensionVersion(30) < 2)) ? Integer.MAX_VALUE : MediaStore.getPickImagesMaxLimit();
                                            Intrinsics.checkNotNullParameter(mediaType2, "mediaType");
                                            f.j jVar3 = new f.j();
                                            jVar3.f16472a = eVar3;
                                            if (i12 >= 33 || (i12 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2)) {
                                                pickImagesMaxLimit4 = MediaStore.getPickImagesMaxLimit();
                                            }
                                            jVar3.f16473b = pickImagesMaxLimit4;
                                            jVar3.f16474c = dVar3;
                                            Intrinsics.checkNotNullParameter(mediaType2, "<set-?>");
                                            jVar3.f16472a = mediaType2;
                                            jVar3.f16473b = pickImagesMaxLimit5;
                                            Intrinsics.checkNotNullParameter(dVar3, "<set-?>");
                                            jVar3.f16474c = dVar3;
                                            intent4 = cVar2.a(activity2, jVar3);
                                        } else {
                                            intent4 = new Intent("android.intent.action.GET_CONTENT");
                                            intent4.setType("video/*");
                                            intent4.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                                        }
                                        activity2.startActivityForResult(intent4, 2348);
                                    }
                                    break;
                                } else {
                                    int iOrdinal2 = tVar2.f36259a.ordinal();
                                    if (iOrdinal2 == 0) {
                                        d dVar4 = gVar3.f36226f;
                                        if (!gVar3.m(null, vVar, bVar2)) {
                                            g.c(bVar2);
                                        } else if (gVar3.l() && t1.b.a((Activity) dVar4.f36218b, "android.permission.CAMERA") != 0) {
                                            t1.b.e((Activity) dVar4.f36218b, new String[]{"android.permission.CAMERA"}, 2355);
                                        } else {
                                            gVar3.k();
                                        }
                                        break;
                                    } else if (iOrdinal2 == 1) {
                                        boolean zBooleanValue6 = nVar2.f36248b.booleanValue();
                                        if (!gVar3.m(null, vVar, bVar2)) {
                                            g.c(bVar2);
                                        } else {
                                            if (zBooleanValue6) {
                                                g.i iVar3 = new g.i(0);
                                                int i13 = Build.VERSION.SDK_INT;
                                                int pickImagesMaxLimit6 = (i13 < 33 && (i13 < 30 || SdkExtensions.getExtensionVersion(30) < 2)) ? Integer.MAX_VALUE : MediaStore.getPickImagesMaxLimit();
                                                Intrinsics.checkNotNullParameter(mediaType2, "mediaType");
                                                f.j jVar4 = new f.j();
                                                jVar4.f16472a = eVar3;
                                                if (i13 >= 33 || (i13 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2)) {
                                                    pickImagesMaxLimit4 = MediaStore.getPickImagesMaxLimit();
                                                }
                                                jVar4.f16473b = pickImagesMaxLimit4;
                                                jVar4.f16474c = dVar3;
                                                Intrinsics.checkNotNullParameter(mediaType2, "<set-?>");
                                                jVar4.f16472a = mediaType2;
                                                jVar4.f16473b = pickImagesMaxLimit6;
                                                Intrinsics.checkNotNullParameter(dVar3, "<set-?>");
                                                jVar4.f16474c = dVar3;
                                                intent3 = iVar3.a(activity2, jVar4);
                                            } else {
                                                intent3 = new Intent("android.intent.action.GET_CONTENT");
                                                intent3.setType("video/*");
                                            }
                                            activity2.startActivityForResult(intent3, 2352);
                                        }
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = (ArrayList) obj2;
                            q qVar = (q) arrayList6.get(0);
                            n nVar3 = (n) arrayList6.get(1);
                            jh.b bVar3 = new jh.b(arrayList5, eVar, 15);
                            h3 h3Var3 = this.f36251c.f36236c;
                            g gVar4 = (h3Var3 == null || ((Activity) h3Var3.f28251c) == null) ? null : (g) h3Var3.f28252d;
                            if (gVar4 == null) {
                                bVar3.c(new m("no_activity", "image_picker plugin requires a foreground activity."));
                            } else if (!gVar4.m(qVar.f36255a, null, bVar3)) {
                                g.c(bVar3);
                            } else {
                                Activity activity3 = gVar4.f36223c;
                                if (nVar3.f36248b.booleanValue()) {
                                    boolean zBooleanValue7 = nVar3.f36247a.booleanValue();
                                    g.d dVar5 = g.d.f19498a;
                                    int pickImagesMaxLimit7 = Integer.MAX_VALUE;
                                    g.e mediaType3 = g.e.f19499a;
                                    if (zBooleanValue7) {
                                        g.c cVar3 = new g.c(j0.g.M(nVar3));
                                        int i14 = Build.VERSION.SDK_INT;
                                        int pickImagesMaxLimit8 = (i14 < 33 && (i14 < 30 || SdkExtensions.getExtensionVersion(30) < 2)) ? Integer.MAX_VALUE : MediaStore.getPickImagesMaxLimit();
                                        Intrinsics.checkNotNullParameter(mediaType3, "mediaType");
                                        f.j jVar5 = new f.j();
                                        jVar5.f16472a = mediaType3;
                                        if (i14 >= 33 || (i14 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2)) {
                                            pickImagesMaxLimit7 = MediaStore.getPickImagesMaxLimit();
                                        }
                                        jVar5.f16473b = pickImagesMaxLimit7;
                                        jVar5.f16474c = dVar5;
                                        Intrinsics.checkNotNullParameter(mediaType3, "<set-?>");
                                        jVar5.f16472a = mediaType3;
                                        jVar5.f16473b = pickImagesMaxLimit8;
                                        Intrinsics.checkNotNullParameter(dVar5, "<set-?>");
                                        jVar5.f16474c = dVar5;
                                        intent5 = cVar3.a(activity3, jVar5);
                                    } else {
                                        g.i iVar4 = new g.i(0);
                                        int i15 = Build.VERSION.SDK_INT;
                                        int pickImagesMaxLimit9 = (i15 < 33 && (i15 < 30 || SdkExtensions.getExtensionVersion(30) < 2)) ? Integer.MAX_VALUE : MediaStore.getPickImagesMaxLimit();
                                        Intrinsics.checkNotNullParameter(mediaType3, "mediaType");
                                        f.j jVar6 = new f.j();
                                        jVar6.f16472a = mediaType3;
                                        if (i15 >= 33 || (i15 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2)) {
                                            pickImagesMaxLimit7 = MediaStore.getPickImagesMaxLimit();
                                        }
                                        jVar6.f16473b = pickImagesMaxLimit7;
                                        jVar6.f16474c = dVar5;
                                        Intrinsics.checkNotNullParameter(mediaType3, "<set-?>");
                                        jVar6.f16472a = mediaType3;
                                        jVar6.f16473b = pickImagesMaxLimit9;
                                        Intrinsics.checkNotNullParameter(dVar5, "<set-?>");
                                        jVar6.f16474c = dVar5;
                                        intent5 = iVar4.a(activity3, jVar6);
                                    }
                                } else {
                                    intent5 = new Intent("android.intent.action.GET_CONTENT");
                                    intent5.setType("*/*");
                                    intent5.putExtra("CONTENT_TYPE", new String[]{"video/*", "image/*"});
                                    intent5.putExtra("android.intent.extra.ALLOW_MULTIPLE", nVar3.f36247a);
                                }
                                activity3.startActivityForResult(intent5, 2347);
                            }
                            break;
                        default:
                            i iVar5 = this.f36251c;
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                arrayList7.add(0, iVar5.a());
                            } catch (Throwable th2) {
                                arrayList7 = k3.f.K(th2);
                            }
                            eVar.i(arrayList7);
                            break;
                    }
                }
            });
        } else {
            gVar2.L(null);
        }
        s7.g gVar3 = new s7.g(fVar, "dev.flutter.pigeon.image_picker_android.ImagePickerApi.pickMedia", rVar, obj);
        if (iVar != null) {
            final int i11 = 2;
            gVar3.L(new ii.b(iVar) { // from class: xi.o

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ i f36251c;

                {
                    this.f36251c = iVar;
                }

                @Override // ii.b
                public final void q(Object obj2, h3.e eVar) {
                    Intent intent;
                    Intent intent2;
                    Intent intent3;
                    Intent intent4;
                    Intent intent5;
                    switch (i11) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = (ArrayList) obj2;
                            t tVar = (t) arrayList2.get(0);
                            p pVar = (p) arrayList2.get(1);
                            n nVar = (n) arrayList2.get(2);
                            jh.b bVar = new jh.b(arrayList, eVar, 13);
                            h3 h3Var = this.f36251c.f36236c;
                            g gVar22 = (h3Var == null || ((Activity) h3Var.f28251c) == null) ? null : (g) h3Var.f28252d;
                            if (gVar22 == null) {
                                bVar.c(new m("no_activity", "image_picker plugin requires a foreground activity."));
                                break;
                            } else {
                                Activity activity = gVar22.f36223c;
                                s sVar = tVar.f36260b;
                                if (sVar != null) {
                                    gVar22.f36229j = sVar.ordinal() != 1 ? 1 : 2;
                                }
                                boolean zBooleanValue = nVar.f36247a.booleanValue();
                                g.f mediaType = g.f.f19500a;
                                g.e eVar2 = g.e.f19499a;
                                int pickImagesMaxLimit = Integer.MAX_VALUE;
                                g.d dVar = g.d.f19498a;
                                if (zBooleanValue) {
                                    int iM = j0.g.M(nVar);
                                    boolean zBooleanValue2 = nVar.f36248b.booleanValue();
                                    if (!gVar22.m(pVar, null, bVar)) {
                                        g.c(bVar);
                                    } else {
                                        if (zBooleanValue2) {
                                            g.c cVar = new g.c(iM);
                                            int i102 = Build.VERSION.SDK_INT;
                                            int pickImagesMaxLimit2 = (i102 < 33 && (i102 < 30 || SdkExtensions.getExtensionVersion(30) < 2)) ? Integer.MAX_VALUE : MediaStore.getPickImagesMaxLimit();
                                            Intrinsics.checkNotNullParameter(mediaType, "mediaType");
                                            f.j jVar = new f.j();
                                            jVar.f16472a = eVar2;
                                            if (i102 >= 33 || (i102 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2)) {
                                                pickImagesMaxLimit = MediaStore.getPickImagesMaxLimit();
                                            }
                                            jVar.f16473b = pickImagesMaxLimit;
                                            jVar.f16474c = dVar;
                                            Intrinsics.checkNotNullParameter(mediaType, "<set-?>");
                                            jVar.f16472a = mediaType;
                                            jVar.f16473b = pickImagesMaxLimit2;
                                            Intrinsics.checkNotNullParameter(dVar, "<set-?>");
                                            jVar.f16474c = dVar;
                                            intent2 = cVar.a(activity, jVar);
                                        } else {
                                            intent2 = new Intent("android.intent.action.GET_CONTENT");
                                            intent2.setType("image/*");
                                            intent2.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                                        }
                                        activity.startActivityForResult(intent2, 2346);
                                    }
                                    break;
                                } else {
                                    int iOrdinal = tVar.f36259a.ordinal();
                                    if (iOrdinal == 0) {
                                        d dVar2 = gVar22.f36226f;
                                        if (!gVar22.m(pVar, null, bVar)) {
                                            g.c(bVar);
                                        } else if (gVar22.l() && t1.b.a((Activity) dVar2.f36218b, "android.permission.CAMERA") != 0) {
                                            t1.b.e((Activity) dVar2.f36218b, new String[]{"android.permission.CAMERA"}, 2345);
                                        } else {
                                            gVar22.j();
                                        }
                                        break;
                                    } else if (iOrdinal == 1) {
                                        boolean zBooleanValue3 = nVar.f36248b.booleanValue();
                                        if (!gVar22.m(pVar, null, bVar)) {
                                            g.c(bVar);
                                        } else {
                                            if (zBooleanValue3) {
                                                g.i iVar2 = new g.i(0);
                                                int i112 = Build.VERSION.SDK_INT;
                                                int pickImagesMaxLimit3 = (i112 < 33 && (i112 < 30 || SdkExtensions.getExtensionVersion(30) < 2)) ? Integer.MAX_VALUE : MediaStore.getPickImagesMaxLimit();
                                                Intrinsics.checkNotNullParameter(mediaType, "mediaType");
                                                f.j jVar2 = new f.j();
                                                jVar2.f16472a = eVar2;
                                                if (i112 >= 33 || (i112 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2)) {
                                                    pickImagesMaxLimit = MediaStore.getPickImagesMaxLimit();
                                                }
                                                jVar2.f16473b = pickImagesMaxLimit;
                                                jVar2.f16474c = dVar;
                                                Intrinsics.checkNotNullParameter(mediaType, "<set-?>");
                                                jVar2.f16472a = mediaType;
                                                jVar2.f16473b = pickImagesMaxLimit3;
                                                Intrinsics.checkNotNullParameter(dVar, "<set-?>");
                                                jVar2.f16474c = dVar;
                                                intent = iVar2.a(activity, jVar2);
                                            } else {
                                                intent = new Intent("android.intent.action.GET_CONTENT");
                                                intent.setType("image/*");
                                            }
                                            activity.startActivityForResult(intent, 2342);
                                        }
                                        break;
                                    }
                                }
                            }
                            break;
                        case 1:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            t tVar2 = (t) arrayList4.get(0);
                            v vVar = (v) arrayList4.get(1);
                            n nVar2 = (n) arrayList4.get(2);
                            jh.b bVar2 = new jh.b(arrayList3, eVar, 14);
                            h3 h3Var2 = this.f36251c.f36236c;
                            g gVar32 = (h3Var2 == null || ((Activity) h3Var2.f28251c) == null) ? null : (g) h3Var2.f28252d;
                            if (gVar32 == null) {
                                bVar2.c(new m("no_activity", "image_picker plugin requires a foreground activity."));
                                break;
                            } else {
                                Activity activity2 = gVar32.f36223c;
                                s sVar2 = tVar2.f36260b;
                                if (sVar2 != null) {
                                    gVar32.f36229j = sVar2.ordinal() != 1 ? 1 : 2;
                                }
                                boolean zBooleanValue4 = nVar2.f36247a.booleanValue();
                                g.g mediaType2 = g.g.f19501a;
                                g.e eVar3 = g.e.f19499a;
                                int pickImagesMaxLimit4 = Integer.MAX_VALUE;
                                g.d dVar3 = g.d.f19498a;
                                if (zBooleanValue4) {
                                    int iM2 = j0.g.M(nVar2);
                                    boolean zBooleanValue5 = nVar2.f36248b.booleanValue();
                                    if (!gVar32.m(null, vVar, bVar2)) {
                                        g.c(bVar2);
                                    } else {
                                        if (zBooleanValue5) {
                                            g.c cVar2 = new g.c(iM2);
                                            int i12 = Build.VERSION.SDK_INT;
                                            int pickImagesMaxLimit5 = (i12 < 33 && (i12 < 30 || SdkExtensions.getExtensionVersion(30) < 2)) ? Integer.MAX_VALUE : MediaStore.getPickImagesMaxLimit();
                                            Intrinsics.checkNotNullParameter(mediaType2, "mediaType");
                                            f.j jVar3 = new f.j();
                                            jVar3.f16472a = eVar3;
                                            if (i12 >= 33 || (i12 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2)) {
                                                pickImagesMaxLimit4 = MediaStore.getPickImagesMaxLimit();
                                            }
                                            jVar3.f16473b = pickImagesMaxLimit4;
                                            jVar3.f16474c = dVar3;
                                            Intrinsics.checkNotNullParameter(mediaType2, "<set-?>");
                                            jVar3.f16472a = mediaType2;
                                            jVar3.f16473b = pickImagesMaxLimit5;
                                            Intrinsics.checkNotNullParameter(dVar3, "<set-?>");
                                            jVar3.f16474c = dVar3;
                                            intent4 = cVar2.a(activity2, jVar3);
                                        } else {
                                            intent4 = new Intent("android.intent.action.GET_CONTENT");
                                            intent4.setType("video/*");
                                            intent4.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                                        }
                                        activity2.startActivityForResult(intent4, 2348);
                                    }
                                    break;
                                } else {
                                    int iOrdinal2 = tVar2.f36259a.ordinal();
                                    if (iOrdinal2 == 0) {
                                        d dVar4 = gVar32.f36226f;
                                        if (!gVar32.m(null, vVar, bVar2)) {
                                            g.c(bVar2);
                                        } else if (gVar32.l() && t1.b.a((Activity) dVar4.f36218b, "android.permission.CAMERA") != 0) {
                                            t1.b.e((Activity) dVar4.f36218b, new String[]{"android.permission.CAMERA"}, 2355);
                                        } else {
                                            gVar32.k();
                                        }
                                        break;
                                    } else if (iOrdinal2 == 1) {
                                        boolean zBooleanValue6 = nVar2.f36248b.booleanValue();
                                        if (!gVar32.m(null, vVar, bVar2)) {
                                            g.c(bVar2);
                                        } else {
                                            if (zBooleanValue6) {
                                                g.i iVar3 = new g.i(0);
                                                int i13 = Build.VERSION.SDK_INT;
                                                int pickImagesMaxLimit6 = (i13 < 33 && (i13 < 30 || SdkExtensions.getExtensionVersion(30) < 2)) ? Integer.MAX_VALUE : MediaStore.getPickImagesMaxLimit();
                                                Intrinsics.checkNotNullParameter(mediaType2, "mediaType");
                                                f.j jVar4 = new f.j();
                                                jVar4.f16472a = eVar3;
                                                if (i13 >= 33 || (i13 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2)) {
                                                    pickImagesMaxLimit4 = MediaStore.getPickImagesMaxLimit();
                                                }
                                                jVar4.f16473b = pickImagesMaxLimit4;
                                                jVar4.f16474c = dVar3;
                                                Intrinsics.checkNotNullParameter(mediaType2, "<set-?>");
                                                jVar4.f16472a = mediaType2;
                                                jVar4.f16473b = pickImagesMaxLimit6;
                                                Intrinsics.checkNotNullParameter(dVar3, "<set-?>");
                                                jVar4.f16474c = dVar3;
                                                intent3 = iVar3.a(activity2, jVar4);
                                            } else {
                                                intent3 = new Intent("android.intent.action.GET_CONTENT");
                                                intent3.setType("video/*");
                                            }
                                            activity2.startActivityForResult(intent3, 2352);
                                        }
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = (ArrayList) obj2;
                            q qVar = (q) arrayList6.get(0);
                            n nVar3 = (n) arrayList6.get(1);
                            jh.b bVar3 = new jh.b(arrayList5, eVar, 15);
                            h3 h3Var3 = this.f36251c.f36236c;
                            g gVar4 = (h3Var3 == null || ((Activity) h3Var3.f28251c) == null) ? null : (g) h3Var3.f28252d;
                            if (gVar4 == null) {
                                bVar3.c(new m("no_activity", "image_picker plugin requires a foreground activity."));
                            } else if (!gVar4.m(qVar.f36255a, null, bVar3)) {
                                g.c(bVar3);
                            } else {
                                Activity activity3 = gVar4.f36223c;
                                if (nVar3.f36248b.booleanValue()) {
                                    boolean zBooleanValue7 = nVar3.f36247a.booleanValue();
                                    g.d dVar5 = g.d.f19498a;
                                    int pickImagesMaxLimit7 = Integer.MAX_VALUE;
                                    g.e mediaType3 = g.e.f19499a;
                                    if (zBooleanValue7) {
                                        g.c cVar3 = new g.c(j0.g.M(nVar3));
                                        int i14 = Build.VERSION.SDK_INT;
                                        int pickImagesMaxLimit8 = (i14 < 33 && (i14 < 30 || SdkExtensions.getExtensionVersion(30) < 2)) ? Integer.MAX_VALUE : MediaStore.getPickImagesMaxLimit();
                                        Intrinsics.checkNotNullParameter(mediaType3, "mediaType");
                                        f.j jVar5 = new f.j();
                                        jVar5.f16472a = mediaType3;
                                        if (i14 >= 33 || (i14 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2)) {
                                            pickImagesMaxLimit7 = MediaStore.getPickImagesMaxLimit();
                                        }
                                        jVar5.f16473b = pickImagesMaxLimit7;
                                        jVar5.f16474c = dVar5;
                                        Intrinsics.checkNotNullParameter(mediaType3, "<set-?>");
                                        jVar5.f16472a = mediaType3;
                                        jVar5.f16473b = pickImagesMaxLimit8;
                                        Intrinsics.checkNotNullParameter(dVar5, "<set-?>");
                                        jVar5.f16474c = dVar5;
                                        intent5 = cVar3.a(activity3, jVar5);
                                    } else {
                                        g.i iVar4 = new g.i(0);
                                        int i15 = Build.VERSION.SDK_INT;
                                        int pickImagesMaxLimit9 = (i15 < 33 && (i15 < 30 || SdkExtensions.getExtensionVersion(30) < 2)) ? Integer.MAX_VALUE : MediaStore.getPickImagesMaxLimit();
                                        Intrinsics.checkNotNullParameter(mediaType3, "mediaType");
                                        f.j jVar6 = new f.j();
                                        jVar6.f16472a = mediaType3;
                                        if (i15 >= 33 || (i15 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2)) {
                                            pickImagesMaxLimit7 = MediaStore.getPickImagesMaxLimit();
                                        }
                                        jVar6.f16473b = pickImagesMaxLimit7;
                                        jVar6.f16474c = dVar5;
                                        Intrinsics.checkNotNullParameter(mediaType3, "<set-?>");
                                        jVar6.f16472a = mediaType3;
                                        jVar6.f16473b = pickImagesMaxLimit9;
                                        Intrinsics.checkNotNullParameter(dVar5, "<set-?>");
                                        jVar6.f16474c = dVar5;
                                        intent5 = iVar4.a(activity3, jVar6);
                                    }
                                } else {
                                    intent5 = new Intent("android.intent.action.GET_CONTENT");
                                    intent5.setType("*/*");
                                    intent5.putExtra("CONTENT_TYPE", new String[]{"video/*", "image/*"});
                                    intent5.putExtra("android.intent.extra.ALLOW_MULTIPLE", nVar3.f36247a);
                                }
                                activity3.startActivityForResult(intent5, 2347);
                            }
                            break;
                        default:
                            i iVar5 = this.f36251c;
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                arrayList7.add(0, iVar5.a());
                            } catch (Throwable th2) {
                                arrayList7 = k3.f.K(th2);
                            }
                            eVar.i(arrayList7);
                            break;
                    }
                }
            });
        } else {
            gVar3.L(null);
        }
        s7.g gVar4 = new s7.g(fVar, "dev.flutter.pigeon.image_picker_android.ImagePickerApi.retrieveLostResults", rVar, t0VarA);
        if (iVar == null) {
            gVar4.L(null);
        } else {
            final int i12 = 3;
            gVar4.L(new ii.b(iVar) { // from class: xi.o

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ i f36251c;

                {
                    this.f36251c = iVar;
                }

                @Override // ii.b
                public final void q(Object obj2, h3.e eVar) {
                    Intent intent;
                    Intent intent2;
                    Intent intent3;
                    Intent intent4;
                    Intent intent5;
                    switch (i12) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = (ArrayList) obj2;
                            t tVar = (t) arrayList2.get(0);
                            p pVar = (p) arrayList2.get(1);
                            n nVar = (n) arrayList2.get(2);
                            jh.b bVar = new jh.b(arrayList, eVar, 13);
                            h3 h3Var = this.f36251c.f36236c;
                            g gVar22 = (h3Var == null || ((Activity) h3Var.f28251c) == null) ? null : (g) h3Var.f28252d;
                            if (gVar22 == null) {
                                bVar.c(new m("no_activity", "image_picker plugin requires a foreground activity."));
                                break;
                            } else {
                                Activity activity = gVar22.f36223c;
                                s sVar = tVar.f36260b;
                                if (sVar != null) {
                                    gVar22.f36229j = sVar.ordinal() != 1 ? 1 : 2;
                                }
                                boolean zBooleanValue = nVar.f36247a.booleanValue();
                                g.f mediaType = g.f.f19500a;
                                g.e eVar2 = g.e.f19499a;
                                int pickImagesMaxLimit = Integer.MAX_VALUE;
                                g.d dVar = g.d.f19498a;
                                if (zBooleanValue) {
                                    int iM = j0.g.M(nVar);
                                    boolean zBooleanValue2 = nVar.f36248b.booleanValue();
                                    if (!gVar22.m(pVar, null, bVar)) {
                                        g.c(bVar);
                                    } else {
                                        if (zBooleanValue2) {
                                            g.c cVar = new g.c(iM);
                                            int i102 = Build.VERSION.SDK_INT;
                                            int pickImagesMaxLimit2 = (i102 < 33 && (i102 < 30 || SdkExtensions.getExtensionVersion(30) < 2)) ? Integer.MAX_VALUE : MediaStore.getPickImagesMaxLimit();
                                            Intrinsics.checkNotNullParameter(mediaType, "mediaType");
                                            f.j jVar = new f.j();
                                            jVar.f16472a = eVar2;
                                            if (i102 >= 33 || (i102 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2)) {
                                                pickImagesMaxLimit = MediaStore.getPickImagesMaxLimit();
                                            }
                                            jVar.f16473b = pickImagesMaxLimit;
                                            jVar.f16474c = dVar;
                                            Intrinsics.checkNotNullParameter(mediaType, "<set-?>");
                                            jVar.f16472a = mediaType;
                                            jVar.f16473b = pickImagesMaxLimit2;
                                            Intrinsics.checkNotNullParameter(dVar, "<set-?>");
                                            jVar.f16474c = dVar;
                                            intent2 = cVar.a(activity, jVar);
                                        } else {
                                            intent2 = new Intent("android.intent.action.GET_CONTENT");
                                            intent2.setType("image/*");
                                            intent2.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                                        }
                                        activity.startActivityForResult(intent2, 2346);
                                    }
                                    break;
                                } else {
                                    int iOrdinal = tVar.f36259a.ordinal();
                                    if (iOrdinal == 0) {
                                        d dVar2 = gVar22.f36226f;
                                        if (!gVar22.m(pVar, null, bVar)) {
                                            g.c(bVar);
                                        } else if (gVar22.l() && t1.b.a((Activity) dVar2.f36218b, "android.permission.CAMERA") != 0) {
                                            t1.b.e((Activity) dVar2.f36218b, new String[]{"android.permission.CAMERA"}, 2345);
                                        } else {
                                            gVar22.j();
                                        }
                                        break;
                                    } else if (iOrdinal == 1) {
                                        boolean zBooleanValue3 = nVar.f36248b.booleanValue();
                                        if (!gVar22.m(pVar, null, bVar)) {
                                            g.c(bVar);
                                        } else {
                                            if (zBooleanValue3) {
                                                g.i iVar2 = new g.i(0);
                                                int i112 = Build.VERSION.SDK_INT;
                                                int pickImagesMaxLimit3 = (i112 < 33 && (i112 < 30 || SdkExtensions.getExtensionVersion(30) < 2)) ? Integer.MAX_VALUE : MediaStore.getPickImagesMaxLimit();
                                                Intrinsics.checkNotNullParameter(mediaType, "mediaType");
                                                f.j jVar2 = new f.j();
                                                jVar2.f16472a = eVar2;
                                                if (i112 >= 33 || (i112 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2)) {
                                                    pickImagesMaxLimit = MediaStore.getPickImagesMaxLimit();
                                                }
                                                jVar2.f16473b = pickImagesMaxLimit;
                                                jVar2.f16474c = dVar;
                                                Intrinsics.checkNotNullParameter(mediaType, "<set-?>");
                                                jVar2.f16472a = mediaType;
                                                jVar2.f16473b = pickImagesMaxLimit3;
                                                Intrinsics.checkNotNullParameter(dVar, "<set-?>");
                                                jVar2.f16474c = dVar;
                                                intent = iVar2.a(activity, jVar2);
                                            } else {
                                                intent = new Intent("android.intent.action.GET_CONTENT");
                                                intent.setType("image/*");
                                            }
                                            activity.startActivityForResult(intent, 2342);
                                        }
                                        break;
                                    }
                                }
                            }
                            break;
                        case 1:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            t tVar2 = (t) arrayList4.get(0);
                            v vVar = (v) arrayList4.get(1);
                            n nVar2 = (n) arrayList4.get(2);
                            jh.b bVar2 = new jh.b(arrayList3, eVar, 14);
                            h3 h3Var2 = this.f36251c.f36236c;
                            g gVar32 = (h3Var2 == null || ((Activity) h3Var2.f28251c) == null) ? null : (g) h3Var2.f28252d;
                            if (gVar32 == null) {
                                bVar2.c(new m("no_activity", "image_picker plugin requires a foreground activity."));
                                break;
                            } else {
                                Activity activity2 = gVar32.f36223c;
                                s sVar2 = tVar2.f36260b;
                                if (sVar2 != null) {
                                    gVar32.f36229j = sVar2.ordinal() != 1 ? 1 : 2;
                                }
                                boolean zBooleanValue4 = nVar2.f36247a.booleanValue();
                                g.g mediaType2 = g.g.f19501a;
                                g.e eVar3 = g.e.f19499a;
                                int pickImagesMaxLimit4 = Integer.MAX_VALUE;
                                g.d dVar3 = g.d.f19498a;
                                if (zBooleanValue4) {
                                    int iM2 = j0.g.M(nVar2);
                                    boolean zBooleanValue5 = nVar2.f36248b.booleanValue();
                                    if (!gVar32.m(null, vVar, bVar2)) {
                                        g.c(bVar2);
                                    } else {
                                        if (zBooleanValue5) {
                                            g.c cVar2 = new g.c(iM2);
                                            int i122 = Build.VERSION.SDK_INT;
                                            int pickImagesMaxLimit5 = (i122 < 33 && (i122 < 30 || SdkExtensions.getExtensionVersion(30) < 2)) ? Integer.MAX_VALUE : MediaStore.getPickImagesMaxLimit();
                                            Intrinsics.checkNotNullParameter(mediaType2, "mediaType");
                                            f.j jVar3 = new f.j();
                                            jVar3.f16472a = eVar3;
                                            if (i122 >= 33 || (i122 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2)) {
                                                pickImagesMaxLimit4 = MediaStore.getPickImagesMaxLimit();
                                            }
                                            jVar3.f16473b = pickImagesMaxLimit4;
                                            jVar3.f16474c = dVar3;
                                            Intrinsics.checkNotNullParameter(mediaType2, "<set-?>");
                                            jVar3.f16472a = mediaType2;
                                            jVar3.f16473b = pickImagesMaxLimit5;
                                            Intrinsics.checkNotNullParameter(dVar3, "<set-?>");
                                            jVar3.f16474c = dVar3;
                                            intent4 = cVar2.a(activity2, jVar3);
                                        } else {
                                            intent4 = new Intent("android.intent.action.GET_CONTENT");
                                            intent4.setType("video/*");
                                            intent4.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                                        }
                                        activity2.startActivityForResult(intent4, 2348);
                                    }
                                    break;
                                } else {
                                    int iOrdinal2 = tVar2.f36259a.ordinal();
                                    if (iOrdinal2 == 0) {
                                        d dVar4 = gVar32.f36226f;
                                        if (!gVar32.m(null, vVar, bVar2)) {
                                            g.c(bVar2);
                                        } else if (gVar32.l() && t1.b.a((Activity) dVar4.f36218b, "android.permission.CAMERA") != 0) {
                                            t1.b.e((Activity) dVar4.f36218b, new String[]{"android.permission.CAMERA"}, 2355);
                                        } else {
                                            gVar32.k();
                                        }
                                        break;
                                    } else if (iOrdinal2 == 1) {
                                        boolean zBooleanValue6 = nVar2.f36248b.booleanValue();
                                        if (!gVar32.m(null, vVar, bVar2)) {
                                            g.c(bVar2);
                                        } else {
                                            if (zBooleanValue6) {
                                                g.i iVar3 = new g.i(0);
                                                int i13 = Build.VERSION.SDK_INT;
                                                int pickImagesMaxLimit6 = (i13 < 33 && (i13 < 30 || SdkExtensions.getExtensionVersion(30) < 2)) ? Integer.MAX_VALUE : MediaStore.getPickImagesMaxLimit();
                                                Intrinsics.checkNotNullParameter(mediaType2, "mediaType");
                                                f.j jVar4 = new f.j();
                                                jVar4.f16472a = eVar3;
                                                if (i13 >= 33 || (i13 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2)) {
                                                    pickImagesMaxLimit4 = MediaStore.getPickImagesMaxLimit();
                                                }
                                                jVar4.f16473b = pickImagesMaxLimit4;
                                                jVar4.f16474c = dVar3;
                                                Intrinsics.checkNotNullParameter(mediaType2, "<set-?>");
                                                jVar4.f16472a = mediaType2;
                                                jVar4.f16473b = pickImagesMaxLimit6;
                                                Intrinsics.checkNotNullParameter(dVar3, "<set-?>");
                                                jVar4.f16474c = dVar3;
                                                intent3 = iVar3.a(activity2, jVar4);
                                            } else {
                                                intent3 = new Intent("android.intent.action.GET_CONTENT");
                                                intent3.setType("video/*");
                                            }
                                            activity2.startActivityForResult(intent3, 2352);
                                        }
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = (ArrayList) obj2;
                            q qVar = (q) arrayList6.get(0);
                            n nVar3 = (n) arrayList6.get(1);
                            jh.b bVar3 = new jh.b(arrayList5, eVar, 15);
                            h3 h3Var3 = this.f36251c.f36236c;
                            g gVar42 = (h3Var3 == null || ((Activity) h3Var3.f28251c) == null) ? null : (g) h3Var3.f28252d;
                            if (gVar42 == null) {
                                bVar3.c(new m("no_activity", "image_picker plugin requires a foreground activity."));
                            } else if (!gVar42.m(qVar.f36255a, null, bVar3)) {
                                g.c(bVar3);
                            } else {
                                Activity activity3 = gVar42.f36223c;
                                if (nVar3.f36248b.booleanValue()) {
                                    boolean zBooleanValue7 = nVar3.f36247a.booleanValue();
                                    g.d dVar5 = g.d.f19498a;
                                    int pickImagesMaxLimit7 = Integer.MAX_VALUE;
                                    g.e mediaType3 = g.e.f19499a;
                                    if (zBooleanValue7) {
                                        g.c cVar3 = new g.c(j0.g.M(nVar3));
                                        int i14 = Build.VERSION.SDK_INT;
                                        int pickImagesMaxLimit8 = (i14 < 33 && (i14 < 30 || SdkExtensions.getExtensionVersion(30) < 2)) ? Integer.MAX_VALUE : MediaStore.getPickImagesMaxLimit();
                                        Intrinsics.checkNotNullParameter(mediaType3, "mediaType");
                                        f.j jVar5 = new f.j();
                                        jVar5.f16472a = mediaType3;
                                        if (i14 >= 33 || (i14 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2)) {
                                            pickImagesMaxLimit7 = MediaStore.getPickImagesMaxLimit();
                                        }
                                        jVar5.f16473b = pickImagesMaxLimit7;
                                        jVar5.f16474c = dVar5;
                                        Intrinsics.checkNotNullParameter(mediaType3, "<set-?>");
                                        jVar5.f16472a = mediaType3;
                                        jVar5.f16473b = pickImagesMaxLimit8;
                                        Intrinsics.checkNotNullParameter(dVar5, "<set-?>");
                                        jVar5.f16474c = dVar5;
                                        intent5 = cVar3.a(activity3, jVar5);
                                    } else {
                                        g.i iVar4 = new g.i(0);
                                        int i15 = Build.VERSION.SDK_INT;
                                        int pickImagesMaxLimit9 = (i15 < 33 && (i15 < 30 || SdkExtensions.getExtensionVersion(30) < 2)) ? Integer.MAX_VALUE : MediaStore.getPickImagesMaxLimit();
                                        Intrinsics.checkNotNullParameter(mediaType3, "mediaType");
                                        f.j jVar6 = new f.j();
                                        jVar6.f16472a = mediaType3;
                                        if (i15 >= 33 || (i15 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2)) {
                                            pickImagesMaxLimit7 = MediaStore.getPickImagesMaxLimit();
                                        }
                                        jVar6.f16473b = pickImagesMaxLimit7;
                                        jVar6.f16474c = dVar5;
                                        Intrinsics.checkNotNullParameter(mediaType3, "<set-?>");
                                        jVar6.f16472a = mediaType3;
                                        jVar6.f16473b = pickImagesMaxLimit9;
                                        Intrinsics.checkNotNullParameter(dVar5, "<set-?>");
                                        jVar6.f16474c = dVar5;
                                        intent5 = iVar4.a(activity3, jVar6);
                                    }
                                } else {
                                    intent5 = new Intent("android.intent.action.GET_CONTENT");
                                    intent5.setType("*/*");
                                    intent5.putExtra("CONTENT_TYPE", new String[]{"video/*", "image/*"});
                                    intent5.putExtra("android.intent.extra.ALLOW_MULTIPLE", nVar3.f36247a);
                                }
                                activity3.startActivityForResult(intent5, 2347);
                            }
                            break;
                        default:
                            i iVar5 = this.f36251c;
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                arrayList7.add(0, iVar5.a());
                            } catch (Throwable th2) {
                                arrayList7 = k3.f.K(th2);
                            }
                            eVar.i(arrayList7);
                            break;
                    }
                }
            });
        }
    }

    public final k a() {
        boolean z5;
        Object obj;
        ArrayList arrayList;
        Set<String> stringSet;
        h3 h3Var = this.f36236c;
        g gVar = (h3Var == null || ((Activity) h3Var.f28251c) == null) ? null : (g) h3Var.f28252d;
        if (gVar == null) {
            throw new m("no_activity", "image_picker plugin requires a foreground activity.");
        }
        ti.m mVar = gVar.f36225e;
        mVar.getClass();
        Context context = mVar.f33853a;
        HashMap map = new HashMap();
        int i = 0;
        SharedPreferences sharedPreferences = context.getSharedPreferences("flutter_image_picker_shared_preference", 0);
        boolean z10 = true;
        if (!sharedPreferences.contains("flutter_image_picker_image_path") || (stringSet = sharedPreferences.getStringSet("flutter_image_picker_image_path", null)) == null) {
            z5 = false;
        } else {
            map.put("pathList", new ArrayList(stringSet));
            z5 = true;
        }
        if (sharedPreferences.contains("flutter_image_picker_error_code")) {
            String string = sharedPreferences.getString("flutter_image_picker_error_code", "");
            String string2 = sharedPreferences.contains("flutter_image_picker_error_message") ? sharedPreferences.getString("flutter_image_picker_error_message", "") : null;
            j jVar = new j();
            if (string == null) {
                throw new IllegalStateException("Nonnull field \"code\" is null.");
            }
            jVar.f36237a = string;
            jVar.f36238b = string2;
            map.put("error", jVar);
        } else {
            z10 = z5;
        }
        if (z10) {
            if (sharedPreferences.contains("flutter_image_picker_type")) {
                map.put("type", sharedPreferences.getString("flutter_image_picker_type", "").equals(RRWebVideoEvent.EVENT_TAG) ? l.VIDEO : l.IMAGE);
            }
            obj = "pathList";
            if (sharedPreferences.contains("flutter_image_picker_max_width")) {
                map.put("maxWidth", Double.valueOf(Double.longBitsToDouble(sharedPreferences.getLong("flutter_image_picker_max_width", 0L))));
            }
            if (sharedPreferences.contains("flutter_image_picker_max_height")) {
                map.put("maxHeight", Double.valueOf(Double.longBitsToDouble(sharedPreferences.getLong("flutter_image_picker_max_height", 0L))));
            }
            map.put("imageQuality", Integer.valueOf(sharedPreferences.getInt("flutter_image_picker_image_quality", 100)));
        } else {
            obj = "pathList";
        }
        if (map.isEmpty()) {
            return null;
        }
        l lVar = (l) map.get("type");
        if (lVar == null) {
            lVar = null;
        }
        j jVar2 = (j) map.get("error");
        ArrayList<String> arrayList2 = (ArrayList) map.get(obj);
        if (arrayList2 != null) {
            arrayList = new ArrayList();
            for (String str : arrayList2) {
                Double d10 = (Double) map.get("maxWidth");
                Double d11 = (Double) map.get("maxHeight");
                Integer num = (Integer) map.get("imageQuality");
                arrayList.add(gVar.f36224d.f(str, d10, d11, num == null ? 100 : num.intValue()));
                i = 0;
            }
        } else {
            arrayList = null;
        }
        context.getSharedPreferences("flutter_image_picker_shared_preference", i).edit().clear().apply();
        k kVar = new k();
        if (lVar == null) {
            throw new IllegalStateException("Nonnull field \"type\" is null.");
        }
        kVar.f36239a = lVar;
        kVar.f36240b = jVar2;
        if (arrayList == null) {
            throw new IllegalStateException("Nonnull field \"paths\" is null.");
        }
        kVar.f36241c = arrayList;
        return kVar;
    }

    @Override // fi.a
    public final void onAttachedToActivity(fi.b bVar) {
        ei.a aVar = this.f36235b;
        ii.f fVar = aVar.f16383c;
        Application application = (Application) aVar.f16381a;
        h3 h3Var = (h3) bVar;
        w wVar = (w) h3Var.f28250b;
        h3 h3Var2 = new h3();
        h3Var2.f28250b = application;
        h3Var2.f28251c = wVar;
        h3Var2.f28254f = bVar;
        h3Var2.f28255g = fVar;
        ti.m mVar = new ti.m(wVar, false);
        ti.b bVar2 = new ti.b();
        bVar2.f33798b = wVar;
        h3Var2.f28252d = new g(wVar, bVar2, mVar);
        b(fVar, this);
        h3Var2.f28253e = new h(this, wVar);
        h3Var.a((g) h3Var2.f28252d);
        h3Var.b((g) h3Var2.f28252d);
        androidx.lifecycle.p lifecycle = ((HiddenLifecycleReference) h3Var.f28251c).getLifecycle();
        h3Var2.f28256h = lifecycle;
        lifecycle.a((h) h3Var2.f28253e);
        this.f36236c = h3Var2;
    }

    @Override // ei.b
    public final void onAttachedToEngine(ei.a aVar) {
        this.f36235b = aVar;
    }

    @Override // fi.a
    public final void onDetachedFromActivity() {
        h3 h3Var = this.f36236c;
        if (h3Var != null) {
            fi.b bVar = (fi.b) h3Var.f28254f;
            if (bVar != null) {
                ((h3) bVar).g((g) h3Var.f28252d);
                fi.b bVar2 = (fi.b) h3Var.f28254f;
                ((HashSet) ((h3) bVar2).f28252d).remove((g) h3Var.f28252d);
                h3Var.f28254f = null;
            }
            androidx.lifecycle.p pVar = (androidx.lifecycle.p) h3Var.f28256h;
            if (pVar != null) {
                pVar.b((h) h3Var.f28253e);
                h3Var.f28256h = null;
            }
            b((ii.f) h3Var.f28255g, null);
            Application application = (Application) h3Var.f28250b;
            if (application != null) {
                application.unregisterActivityLifecycleCallbacks((h) h3Var.f28253e);
                h3Var.f28250b = null;
            }
            h3Var.f28251c = null;
            h3Var.f28253e = null;
            h3Var.f28252d = null;
            this.f36236c = null;
        }
    }

    @Override // fi.a
    public final void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // ei.b
    public final void onDetachedFromEngine(ei.a aVar) {
        this.f36235b = null;
    }

    @Override // fi.a
    public final void onReattachedToActivityForConfigChanges(fi.b bVar) {
        onAttachedToActivity(bVar);
    }
}
