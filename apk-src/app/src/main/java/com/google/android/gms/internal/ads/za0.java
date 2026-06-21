package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class za0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yc0 f12931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kc0 f12932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q30 f12933c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t90 f12934d;

    public za0(yc0 yc0Var, kc0 kc0Var, q30 q30Var, t90 t90Var) {
        this.f12931a = yc0Var;
        this.f12932b = kc0Var;
        this.f12933c = q30Var;
        this.f12934d = t90Var;
    }

    public final View a() {
        sz szVarA = this.f12931a.a(q9.g3.c(), null, null);
        szVarA.i0().setVisibility(8);
        final int i = 4;
        szVarA.u0("/sendMessageToSdk", new vo(this) { // from class: com.google.android.gms.internal.ads.ya0

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ za0 f12559c;

            {
                this.f12559c = this;
            }

            @Override // com.google.android.gms.internal.ads.vo
            public final void o(Object obj, Map map) {
                switch (i) {
                    case 0:
                        this.f12559c.f12934d.C();
                        break;
                    case 1:
                        sz szVar = (sz) obj;
                        szVar.q0().f7062h = new ut(13, this.f12559c, map);
                        String str = (String) map.get("overlayHtml");
                        String str2 = (String) map.get("baseUrl");
                        if (!TextUtils.isEmpty(str2)) {
                            szVar.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                        } else {
                            szVar.loadData(str, "text/html", "UTF-8");
                        }
                        break;
                    case 2:
                        u9.i.g("Showing native ads overlay.");
                        ((sz) obj).i0().setVisibility(0);
                        this.f12559c.f12933c.f9322g = true;
                        break;
                    case 3:
                        u9.i.g("Hiding native ads overlay.");
                        ((sz) obj).i0().setVisibility(8);
                        this.f12559c.f12933c.f9322g = false;
                        break;
                    default:
                        this.f12559c.f12932b.d(map);
                        break;
                }
            }
        });
        final int i10 = 0;
        szVarA.u0("/adMuted", new vo(this) { // from class: com.google.android.gms.internal.ads.ya0

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ za0 f12559c;

            {
                this.f12559c = this;
            }

            @Override // com.google.android.gms.internal.ads.vo
            public final void o(Object obj, Map map) {
                switch (i10) {
                    case 0:
                        this.f12559c.f12934d.C();
                        break;
                    case 1:
                        sz szVar = (sz) obj;
                        szVar.q0().f7062h = new ut(13, this.f12559c, map);
                        String str = (String) map.get("overlayHtml");
                        String str2 = (String) map.get("baseUrl");
                        if (!TextUtils.isEmpty(str2)) {
                            szVar.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                        } else {
                            szVar.loadData(str, "text/html", "UTF-8");
                        }
                        break;
                    case 2:
                        u9.i.g("Showing native ads overlay.");
                        ((sz) obj).i0().setVisibility(0);
                        this.f12559c.f12933c.f9322g = true;
                        break;
                    case 3:
                        u9.i.g("Hiding native ads overlay.");
                        ((sz) obj).i0().setVisibility(8);
                        this.f12559c.f12933c.f9322g = false;
                        break;
                    default:
                        this.f12559c.f12932b.d(map);
                        break;
                }
            }
        });
        WeakReference weakReference = new WeakReference(szVarA);
        final int i11 = 1;
        vo voVar = new vo(this) { // from class: com.google.android.gms.internal.ads.ya0

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ za0 f12559c;

            {
                this.f12559c = this;
            }

            @Override // com.google.android.gms.internal.ads.vo
            public final void o(Object obj, Map map) {
                switch (i11) {
                    case 0:
                        this.f12559c.f12934d.C();
                        break;
                    case 1:
                        sz szVar = (sz) obj;
                        szVar.q0().f7062h = new ut(13, this.f12559c, map);
                        String str = (String) map.get("overlayHtml");
                        String str2 = (String) map.get("baseUrl");
                        if (!TextUtils.isEmpty(str2)) {
                            szVar.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                        } else {
                            szVar.loadData(str, "text/html", "UTF-8");
                        }
                        break;
                    case 2:
                        u9.i.g("Showing native ads overlay.");
                        ((sz) obj).i0().setVisibility(0);
                        this.f12559c.f12933c.f9322g = true;
                        break;
                    case 3:
                        u9.i.g("Hiding native ads overlay.");
                        ((sz) obj).i0().setVisibility(8);
                        this.f12559c.f12933c.f9322g = false;
                        break;
                    default:
                        this.f12559c.f12932b.d(map);
                        break;
                }
            }
        };
        kc0 kc0Var = this.f12932b;
        kc0Var.b("/loadHtml", new s90(kc0Var, weakReference, "/loadHtml", voVar));
        final int i12 = 2;
        kc0Var.b("/showOverlay", new s90(kc0Var, new WeakReference(szVarA), "/showOverlay", new vo(this) { // from class: com.google.android.gms.internal.ads.ya0

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ za0 f12559c;

            {
                this.f12559c = this;
            }

            @Override // com.google.android.gms.internal.ads.vo
            public final void o(Object obj, Map map) {
                switch (i12) {
                    case 0:
                        this.f12559c.f12934d.C();
                        break;
                    case 1:
                        sz szVar = (sz) obj;
                        szVar.q0().f7062h = new ut(13, this.f12559c, map);
                        String str = (String) map.get("overlayHtml");
                        String str2 = (String) map.get("baseUrl");
                        if (!TextUtils.isEmpty(str2)) {
                            szVar.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                        } else {
                            szVar.loadData(str, "text/html", "UTF-8");
                        }
                        break;
                    case 2:
                        u9.i.g("Showing native ads overlay.");
                        ((sz) obj).i0().setVisibility(0);
                        this.f12559c.f12933c.f9322g = true;
                        break;
                    case 3:
                        u9.i.g("Hiding native ads overlay.");
                        ((sz) obj).i0().setVisibility(8);
                        this.f12559c.f12933c.f9322g = false;
                        break;
                    default:
                        this.f12559c.f12932b.d(map);
                        break;
                }
            }
        }));
        final int i13 = 3;
        kc0Var.b("/hideOverlay", new s90(kc0Var, new WeakReference(szVarA), "/hideOverlay", new vo(this) { // from class: com.google.android.gms.internal.ads.ya0

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ za0 f12559c;

            {
                this.f12559c = this;
            }

            @Override // com.google.android.gms.internal.ads.vo
            public final void o(Object obj, Map map) {
                switch (i13) {
                    case 0:
                        this.f12559c.f12934d.C();
                        break;
                    case 1:
                        sz szVar = (sz) obj;
                        szVar.q0().f7062h = new ut(13, this.f12559c, map);
                        String str = (String) map.get("overlayHtml");
                        String str2 = (String) map.get("baseUrl");
                        if (!TextUtils.isEmpty(str2)) {
                            szVar.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                        } else {
                            szVar.loadData(str, "text/html", "UTF-8");
                        }
                        break;
                    case 2:
                        u9.i.g("Showing native ads overlay.");
                        ((sz) obj).i0().setVisibility(0);
                        this.f12559c.f12933c.f9322g = true;
                        break;
                    case 3:
                        u9.i.g("Hiding native ads overlay.");
                        ((sz) obj).i0().setVisibility(8);
                        this.f12559c.f12933c.f9322g = false;
                        break;
                    default:
                        this.f12559c.f12932b.d(map);
                        break;
                }
            }
        }));
        return szVarA.i0();
    }
}
