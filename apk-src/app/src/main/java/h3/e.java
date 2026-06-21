package h3;

import a0.b1;
import a0.i0;
import a0.q2;
import a7.l;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.util.Log;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import android.util.SparseIntArray;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.u;
import androidx.lifecycle.z0;
import bf.i;
import c7.k;
import com.google.android.gms.internal.ads.om1;
import com.google.android.gms.internal.auth.f0;
import com.google.android.gms.internal.auth.n0;
import fh.nd;
import fh.zf;
import g0.a3;
import g0.d0;
import g0.k2;
import g0.n;
import g0.n2;
import g0.p2;
import g0.v0;
import g0.w;
import g0.x2;
import g2.q;
import hi.f;
import i4.a1;
import ii.m;
import ii.o;
import ii.r;
import ii.x;
import io.flutter.plugin.platform.j;
import io.flutter.plugin.platform.p;
import io.flutter.view.h;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.collections.j0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q4.a0;
import s7.g;
import t.d2;
import t.u0;
import t.y0;
import t.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements ha.d, o, ii.c, q, ii.d, j, f, kk.e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static ki.a f20373e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f20375c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f20376d;

    public /* synthetic */ e(int i) {
        this.f20374b = i;
    }

    public static int B(int i, int i10) {
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < i; i13++) {
            i11++;
            if (i11 == i10) {
                i12++;
                i11 = 0;
            } else if (i11 > i10) {
                i12++;
                i11 = 1;
            }
        }
        return i11 + 1 > i10 ? i12 + 1 : i12;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0080 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0081 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int t(h3.e r11, org.json.JSONArray r12) throws org.json.JSONException, java.lang.NoSuchFieldException {
        /*
            r11 = 0
            r0 = r11
            r1 = r0
            r2 = r1
        L4:
            int r3 = r12.length()
            r4 = 4
            r5 = 2
            r6 = 1
            if (r0 >= r3) goto L68
            java.lang.String r3 = r12.getString(r0)
            int[] r4 = t.z.p(r4)
            int r7 = r4.length
            r8 = r11
        L17:
            if (r8 >= r7) goto L5c
            r9 = r4[r8]
            r10 = 1
            if (r9 == r10) goto L32
            r10 = 2
            if (r9 == r10) goto L2f
            r10 = 3
            if (r9 == r10) goto L2c
            r10 = 4
            if (r9 != r10) goto L2a
            java.lang.String r10 = "DeviceOrientation.landscapeRight"
            goto L34
        L2a:
            r11 = 0
            throw r11
        L2c:
            java.lang.String r10 = "DeviceOrientation.landscapeLeft"
            goto L34
        L2f:
            java.lang.String r10 = "DeviceOrientation.portraitDown"
            goto L34
        L32:
            java.lang.String r10 = "DeviceOrientation.portraitUp"
        L34:
            boolean r10 = r10.equals(r3)
            if (r10 == 0) goto L59
            int r3 = t.z.m(r9)
            if (r3 == 0) goto L51
            if (r3 == r6) goto L4e
            if (r3 == r5) goto L4b
            r4 = 3
            if (r3 == r4) goto L48
            goto L53
        L48:
            r1 = r1 | 8
            goto L53
        L4b:
            r1 = r1 | 2
            goto L53
        L4e:
            r1 = r1 | 4
            goto L53
        L51:
            r1 = r1 | 1
        L53:
            if (r2 != 0) goto L56
            r2 = r1
        L56:
            int r0 = r0 + 1
            goto L4
        L59:
            int r8 = r8 + 1
            goto L17
        L5c:
            java.lang.NoSuchFieldException r11 = new java.lang.NoSuchFieldException
            java.lang.String r12 = "No such DeviceOrientation: "
            java.lang.String r12 = com.google.android.gms.internal.ads.om1.k(r12, r3)
            r11.<init>(r12)
            throw r11
        L68:
            if (r1 == 0) goto L85
            r12 = 8
            switch(r1) {
                case 2: goto L84;
                case 3: goto L7a;
                case 4: goto L82;
                case 5: goto L77;
                case 6: goto L7a;
                case 7: goto L7a;
                case 8: goto L81;
                case 9: goto L7a;
                case 10: goto L74;
                case 11: goto L73;
                case 12: goto L7a;
                case 13: goto L7a;
                case 14: goto L7a;
                case 15: goto L70;
                default: goto L6f;
            }
        L6f:
            goto L80
        L70:
            r11 = 13
            return r11
        L73:
            return r5
        L74:
            r11 = 11
            return r11
        L77:
            r11 = 12
            return r11
        L7a:
            if (r2 == r5) goto L84
            if (r2 == r4) goto L82
            if (r2 == r12) goto L81
        L80:
            return r6
        L81:
            return r12
        L82:
            r11 = 9
        L84:
            return r11
        L85:
            r11 = -1
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: h3.e.t(h3.e, org.json.JSONArray):int");
    }

    public static ArrayList u(e eVar, JSONArray jSONArray) throws JSONException, NoSuchFieldException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            String string = jSONArray.getString(i);
            for (hi.b bVar : hi.b.values()) {
                if (bVar.f20566b.equals(string)) {
                    int iOrdinal = bVar.ordinal();
                    if (iOrdinal == 0) {
                        arrayList.add(hi.b.TOP_OVERLAYS);
                    } else if (iOrdinal == 1) {
                        arrayList.add(hi.b.BOTTOM_OVERLAYS);
                    }
                }
            }
            throw new NoSuchFieldException(om1.k("No such SystemUiOverlay: ", string));
        }
        return arrayList;
    }

    public static int v(e eVar, String str) {
        String str2;
        for (int i : z.p(4)) {
            if (i == 1) {
                str2 = "SystemUiMode.leanBack";
            } else if (i == 2) {
                str2 = "SystemUiMode.immersive";
            } else if (i == 3) {
                str2 = "SystemUiMode.immersiveSticky";
            } else {
                if (i != 4) {
                    throw null;
                }
                str2 = "SystemUiMode.edgeToEdge";
            }
            if (str2.equals(str)) {
                int iM = z.m(i);
                if (iM == 0) {
                    return 1;
                }
                if (iM != 1) {
                    return iM != 2 ? 4 : 3;
                }
                return 2;
            }
        }
        throw new NoSuchFieldException(om1.k("No such SystemUiMode: ", str));
    }

    public static i w(e eVar, JSONObject jSONObject) {
        return new i(!jSONObject.isNull("statusBarColor") ? Integer.valueOf(jSONObject.getInt("statusBarColor")) : null, !jSONObject.isNull("statusBarIconBrightness") ? gf.a.a(jSONObject.getString("statusBarIconBrightness")) : 0, !jSONObject.isNull("systemStatusBarContrastEnforced") ? Boolean.valueOf(jSONObject.getBoolean("systemStatusBarContrastEnforced")) : null, !jSONObject.isNull("systemNavigationBarColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarColor")) : null, jSONObject.isNull("systemNavigationBarIconBrightness") ? 0 : gf.a.a(jSONObject.getString("systemNavigationBarIconBrightness")), !jSONObject.isNull("systemNavigationBarDividerColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarDividerColor")) : null, jSONObject.isNull("systemNavigationBarContrastEnforced") ? null : Boolean.valueOf(jSONObject.getBoolean("systemNavigationBarContrastEnforced")));
    }

    public static HashMap y(int i, int i10, int i11, int i12, String str) {
        HashMap map = new HashMap();
        map.put("text", str);
        l7.o.q(i, map, "selectionBase", i10, "selectionExtent");
        l7.o.q(i11, map, "composingBase", i12, "composingExtent");
        return map;
    }

    public ke.d A(he.d dVar) throws ge.f {
        String string;
        JSONArray jSONArray = dVar.f20501g;
        long j10 = dVar.f20500f;
        HashSet hashSet = new HashSet();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String string2 = jSONObject.getString("rolloutId");
                JSONArray jSONArray2 = jSONObject.getJSONArray("affectedParameterKeys");
                if (jSONArray2.length() > 1) {
                    Log.w("FirebaseRemoteConfig", String.format("Rollout has multiple affected parameter keys.Only the first key will be included in RolloutsState. rolloutId: %s, affectedParameterKeys: %s", string2, jSONArray2));
                }
                String strOptString = jSONArray2.optString(0, "");
                he.d dVarC = ((he.c) this.f20375c).c();
                String string3 = null;
                if (dVarC == null) {
                    string = null;
                } else {
                    try {
                        string = dVarC.f20496b.getString(strOptString);
                    } catch (JSONException unused) {
                        string = null;
                    }
                }
                if (string == null) {
                    he.d dVarC2 = ((he.c) this.f20376d).c();
                    if (dVarC2 != null) {
                        try {
                            string3 = dVarC2.f20496b.getString(strOptString);
                        } catch (JSONException unused2) {
                        }
                    }
                    string = string3 != null ? string3 : "";
                }
                int i10 = ke.e.f27397a;
                ke.b bVar = new ke.b();
                if (string2 == null) {
                    throw new NullPointerException("Null rolloutId");
                }
                bVar.f27385a = string2;
                String string4 = jSONObject.getString("variantId");
                if (string4 == null) {
                    throw new NullPointerException("Null variantId");
                }
                bVar.f27386b = string4;
                if (strOptString == null) {
                    throw new NullPointerException("Null parameterKey");
                }
                bVar.f27387c = strOptString;
                bVar.f27388d = string;
                bVar.f27389e = j10;
                bVar.f27390f = (byte) (bVar.f27390f | 1);
                hashSet.add(bVar.a());
            } catch (JSONException e3) {
                throw new ge.f("Exception parsing rollouts metadata to create RolloutsState.", e3);
            }
        }
        return new ke.d(hashSet);
    }

    public void C() {
        ((SparseIntArray) this.f20375c).clear();
    }

    public void D(u0 cameraDeviceSurfaceManager) {
        Intrinsics.checkNotNullParameter(cameraDeviceSurfaceManager, "cameraDeviceSurfaceManager");
        this.f20376d = cameraDeviceSurfaceManager;
    }

    public a0 E(int i) {
        int i10 = 0;
        while (true) {
            int[] iArr = (int[]) this.f20375c;
            if (i10 >= iArr.length) {
                m3.b.e("BaseMediaChunkOutput", "Unmatched track of type: " + i);
                return new q4.j();
            }
            if (i == iArr[i10]) {
                return ((a1[]) this.f20376d)[i10];
            }
            i10++;
        }
    }

    @Override // ii.d
    public void a(ByteBuffer byteBuffer, zh.f fVar) throws Throwable {
        switch (this.f20374b) {
            case 16:
                g gVar = (g) this.f20376d;
                try {
                    ((ii.b) this.f20375c).q(((m) gVar.f32797d).decodeMessage(byteBuffer), new e(15, (Object) this, (Object) fVar, false));
                } catch (RuntimeException e3) {
                    Log.e("BasicMessageChannel#" + ((String) gVar.f32796c), "Failed to handle message", e3);
                    fVar.a(null);
                    return;
                }
                break;
            default:
                ii.q qVar = (ii.q) this.f20376d;
                r rVar = qVar.f21319c;
                try {
                    ((o) this.f20375c).onMethodCall(rVar.a(byteBuffer), new hi.g(1, this, fVar));
                } catch (RuntimeException e7) {
                    Log.e("MethodChannel#" + qVar.f21318b, "Failed to handle method call", e7);
                    fVar.a(rVar.c(e7.getMessage(), Log.getStackTraceString(e7)));
                }
                break;
        }
    }

    @Override // hi.f
    public void b(boolean z5) {
        ((io.flutter.plugin.platform.q) ((io.flutter.plugin.platform.q) this.f20375c).f25749x.f25711c).f25744s = z5;
    }

    @Override // io.flutter.plugin.platform.j
    public void c(h hVar) {
        ((io.flutter.plugin.platform.q) this.f20375c).f25735j.f25676a = hVar;
        ((p) this.f20376d).i.f25676a = hVar;
    }

    @Override // hi.f
    public void d(int i, int i10) {
        p pVar = (p) this.f20376d;
        if (pVar.f(i) != null) {
            pVar.f25726q.d(i, i10);
        } else {
            ((io.flutter.plugin.platform.q) this.f20375c).f25749x.d(i, i10);
        }
    }

    @Override // hi.f
    public long e(hi.c cVar) {
        return ((io.flutter.plugin.platform.q) this.f20375c).f25749x.e(cVar);
    }

    @Override // io.flutter.plugin.platform.j
    public View f(int i) {
        p pVar = (p) this.f20376d;
        return pVar.f(i) != null ? pVar.f(i) : ((io.flutter.plugin.platform.q) this.f20375c).f(i);
    }

    @Override // hi.f
    public void g(hi.c cVar) {
        ((io.flutter.plugin.platform.q) this.f20375c).f25749x.g(cVar);
    }

    @Override // ha.d
    public Object h(IBinder iBinder) throws IOException, k {
        IInterface rVar;
        int i = f0.f13206c;
        if (iBinder == null) {
            rVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
            rVar = iInterfaceQueryLocalInterface instanceof n0 ? (n0) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.auth.r(iBinder, "com.google.android.auth.IAuthManagerService", 2);
        }
        String str = (String) this.f20375c;
        Bundle bundle = (Bundle) this.f20376d;
        com.google.android.gms.internal.auth.r rVar2 = (com.google.android.gms.internal.auth.r) rVar;
        rVar2.getClass();
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(rVar2.f2257d);
        parcelObtain.writeString(str);
        com.google.android.gms.internal.auth.d.b(parcelObtain, bundle);
        Parcel parcelE0 = rVar2.E0(parcelObtain, 2);
        Bundle bundle2 = (Bundle) com.google.android.gms.internal.auth.d.a(parcelE0, Bundle.CREATOR);
        parcelE0.recycle();
        if (bundle2 == null) {
            ha.a.f20469c.t("Service call returned null.", new Object[0]);
            throw new IOException("Service unavailable.");
        }
        String string = bundle2.getString("Error");
        if (bundle2.getBoolean("booleanResult")) {
            return null;
        }
        throw new k(string);
    }

    @Override // ii.c
    public void i(Object obj) {
        switch (this.f20374b) {
            case 9:
                bb.e eVar = (bb.e) this.f20376d;
                ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) eVar.f2019c;
                hi.i iVar = (hi.i) this.f20375c;
                concurrentLinkedQueue.remove(iVar);
                if (!((ConcurrentLinkedQueue) eVar.f2019c).isEmpty()) {
                    Log.e("SettingsChannel", "The queue becomes empty after removing config generation " + iVar.f20604a);
                }
                break;
            default:
                ((zh.f) this.f20375c).a(((m) ((g) ((e) this.f20376d).f20376d).f32797d).encodeMessage(obj));
                break;
        }
    }

    @Override // hi.f
    public void k(hi.e eVar, e8.e eVar2) {
        if (((p) this.f20376d).f(eVar.f20590a) != null) {
            return;
        }
        ((io.flutter.plugin.platform.q) this.f20375c).f25749x.k(eVar, eVar2);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x008a  */
    @Override // g2.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public g2.x1 l(android.view.View r17, g2.x1 r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            java.lang.Object r3 = r0.f20375c
            ac.c r3 = (ac.c) r3
            java.lang.Object r4 = r0.f20376d
            com.google.android.gms.internal.ads.j0 r4 = (com.google.android.gms.internal.ads.j0) r4
            int r5 = r4.f6666a
            int r6 = r4.f6667b
            int r4 = r4.f6668c
            g2.t1 r7 = r2.f19943a
            r8 = 519(0x207, float:7.27E-43)
            x1.b r8 = r7.h(r8)
            r9 = 32
            x1.b r7 = r7.h(r9)
            java.lang.Object r9 = r3.f739c
            com.google.android.material.bottomsheet.BottomSheetBehavior r9 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r9
            int r10 = r8.f35690b
            int r11 = r8.f35691c
            int r12 = r8.f35689a
            r9.f14508w = r10
            boolean r10 = ic.k.e(r1)
            int r13 = r1.getPaddingBottom()
            int r14 = r1.getPaddingLeft()
            int r15 = r1.getPaddingRight()
            boolean r0 = r9.f14500o
            if (r0 == 0) goto L49
            int r13 = r2.a()
            r9.f14507v = r13
            int r13 = r13 + r4
        L49:
            boolean r4 = r9.f14501p
            if (r4 == 0) goto L54
            if (r10 == 0) goto L51
            r4 = r6
            goto L52
        L51:
            r4 = r5
        L52:
            int r14 = r4 + r12
        L54:
            boolean r4 = r9.f14502q
            if (r4 == 0) goto L5e
            if (r10 == 0) goto L5b
            goto L5c
        L5b:
            r5 = r6
        L5c:
            int r15 = r5 + r11
        L5e:
            android.view.ViewGroup$LayoutParams r4 = r1.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
            boolean r5 = r9.f14504s
            r6 = 1
            if (r5 == 0) goto L71
            int r5 = r4.leftMargin
            if (r5 == r12) goto L71
            r4.leftMargin = r12
            r5 = r6
            goto L72
        L71:
            r5 = 0
        L72:
            boolean r10 = r9.f14505t
            if (r10 == 0) goto L7d
            int r10 = r4.rightMargin
            if (r10 == r11) goto L7d
            r4.rightMargin = r11
            r5 = r6
        L7d:
            boolean r10 = r9.f14506u
            if (r10 == 0) goto L8a
            int r10 = r4.topMargin
            int r8 = r8.f35690b
            if (r10 == r8) goto L8a
            r4.topMargin = r8
            goto L8b
        L8a:
            r6 = r5
        L8b:
            if (r6 == 0) goto L90
            r1.setLayoutParams(r4)
        L90:
            int r4 = r1.getPaddingTop()
            r1.setPadding(r14, r4, r15, r13)
            boolean r1 = r3.f738b
            if (r1 == 0) goto L9f
            int r3 = r7.f35692d
            r9.f14498m = r3
        L9f:
            if (r0 != 0) goto La5
            if (r1 == 0) goto La4
            goto La5
        La4:
            return r2
        La5:
            r9.G()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: h3.e.l(android.view.View, g2.x1):g2.x1");
    }

    @Override // hi.f
    public void m(int i, double d10, double d11) {
        if (((p) this.f20376d).f(i) != null) {
            return;
        }
        ((io.flutter.plugin.platform.q) this.f20375c).f25749x.m(i, d10, d11);
    }

    @Override // hi.f
    public void n(hi.d dVar) {
        p pVar = (p) this.f20376d;
        if (pVar.f(dVar.f20575a) != null) {
            pVar.f25726q.n(dVar);
        } else {
            ((io.flutter.plugin.platform.q) this.f20375c).f25749x.n(dVar);
        }
    }

    @Override // io.flutter.plugin.platform.j
    public boolean o(int i) {
        p pVar = (p) this.f20376d;
        if (pVar.f(i) == null) {
            return ((io.flutter.plugin.platform.q) this.f20375c).o(i);
        }
        pVar.getClass();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03bd  */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v5, types: [int] */
    /* JADX WARN: Type inference failed for: r4v6 */
    @Override // ii.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMethodCall(ii.n r19, ii.p r20) {
        /*
            Method dump skipped, instruction units count: 1122
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h3.e.onMethodCall(ii.n, ii.p):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    @Override // kk.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object p(kk.f r7, mj.a r8) {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h3.e.p(kk.f, mj.a):java.lang.Object");
    }

    @Override // hi.f
    public void q(int i) {
        p pVar = (p) this.f20376d;
        if (pVar.f(i) != null) {
            pVar.f25726q.q(i);
        } else {
            ((io.flutter.plugin.platform.q) this.f20375c).f25749x.q(i);
        }
    }

    @Override // io.flutter.plugin.platform.j
    public void r() {
        ((io.flutter.plugin.platform.q) this.f20375c).r();
        ((p) this.f20376d).r();
    }

    @Override // hi.f
    public void s(int i) {
        p pVar = (p) this.f20376d;
        if (pVar.f(i) != null) {
            pVar.f25726q.s(i);
        } else {
            ((io.flutter.plugin.platform.q) this.f20375c).f25749x.s(i);
        }
    }

    public String toString() {
        switch (this.f20374b) {
            case 0:
                StringBuilder sb2 = new StringBuilder(128);
                sb2.append("LoaderManager{");
                sb2.append(Integer.toHexString(System.identityHashCode(this)));
                sb2.append(" in ");
                Class<?> cls = ((u) this.f20375c).getClass();
                sb2.append(cls.getSimpleName());
                sb2.append("{");
                sb2.append(Integer.toHexString(System.identityHashCode(cls)));
                sb2.append("}}");
                return sb2.toString();
            case 21:
                String string = "[ ";
                if (((k1.e) this.f20375c) != null) {
                    for (int i = 0; i < 9; i++) {
                        StringBuilder sbJ = pe.a.j(string);
                        sbJ.append(((k1.e) this.f20375c).i[i]);
                        sbJ.append(" ");
                        string = sbJ.toString();
                    }
                }
                StringBuilder sbK = pe.a.k(string, "] ");
                sbK.append((k1.e) this.f20375c);
                return sbK.toString();
            default:
                return super.toString();
        }
    }

    public l0.j x(int i, d0 cameraInfoInternal, ArrayList newUseCases, ArrayList attachedUseCases, w cameraConfig, Range targetFrameRate, boolean z5) {
        int i10;
        Rect rectH;
        boolean z10;
        Intrinsics.checkNotNullParameter(cameraInfoInternal, "cameraInfoInternal");
        Intrinsics.checkNotNullParameter(newUseCases, "newUseCases");
        Intrinsics.checkNotNullParameter(attachedUseCases, "attachedUseCases");
        Intrinsics.checkNotNullParameter(cameraConfig, "cameraConfig");
        Intrinsics.checkNotNullParameter(targetFrameRate, "targetFrameRate");
        ArrayList arrayList = new ArrayList();
        String strE = cameraInfoInternal.e();
        String str = "getCameraId(...)";
        Intrinsics.checkNotNullExpressionValue(strE, "getCameraId(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Iterator it = attachedUseCases.iterator();
        while (it.hasNext()) {
            q2 q2Var = (q2) it.next();
            n nVar = q2Var.i;
            if (nVar == null) {
                throw new IllegalArgumentException("Attached stream spec cannot be null for already attached use cases.");
            }
            u0 u0Var = (u0) this.f20376d;
            if (u0Var == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Iterator it2 = it;
            int iK = q2Var.f209h.k();
            Size sizeD = q2Var.d();
            if (sizeD == null) {
                throw new IllegalArgumentException("Attached surface resolution cannot be null for already attached use cases.");
            }
            k2 k2VarM = q2Var.f209h.m();
            d2 d2Var = (d2) u0Var.f33298b.get(strE);
            String str2 = str;
            f2.g.a("No such camera id in supported combination list: " + strE, d2Var != null);
            g0.o oVarL = d2Var.l(iK);
            n2 n2Var = n2.f19693c;
            k2 k2Var = p2.f19713e;
            p2 p2VarF = ya.e.F(iK, sizeD, oVarL, i, n2Var, k2VarM);
            Intrinsics.checkNotNullExpressionValue(p2VarF, "transformSurfaceConfig(...)");
            int iK2 = q2Var.f209h.k();
            Size sizeD2 = q2Var.d();
            Intrinsics.b(sizeD2);
            i0 i0Var = nVar.f19679c;
            ArrayList arrayListK = u0.d.K(q2Var);
            v0 v0Var = nVar.f19682f;
            int iIntValue = ((Integer) q2Var.f209h.g(x2.f19802x, 0)).intValue();
            Range range = (Range) q2Var.f209h.g(x2.f19803y, n.f19676h);
            if (range == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Boolean bool = (Boolean) q2Var.f209h.g(x2.f19804z, Boolean.FALSE);
            Objects.requireNonNull(bool);
            g0.e eVar = new g0.e(p2VarF, iK2, sizeD2, i0Var, arrayListK, v0Var, iIntValue, range, bool.booleanValue());
            Intrinsics.checkNotNullExpressionValue(eVar, "create(...)");
            arrayList.add(eVar);
            linkedHashMap2.put(eVar, q2Var);
            linkedHashMap.put(q2Var, nVar);
            it = it2;
            str = str2;
        }
        Pair pair = new Pair(linkedHashMap, linkedHashMap2);
        Object second = pair.second;
        Intrinsics.checkNotNullExpressionValue(second, "second");
        Map map = (Map) second;
        HashMap mapV = l0.f.v(newUseCases, (a3) cameraConfig.g(w.f19783a, a3.f19519a), (y0) this.f20375c, targetFrameRate);
        Intrinsics.checkNotNullExpressionValue(mapV, "getConfigs(...)");
        String strE2 = cameraInfoInternal.e();
        Intrinsics.checkNotNullExpressionValue(strE2, str);
        LinkedHashMap streamSpecs = new LinkedHashMap();
        if (newUseCases.isEmpty()) {
            i10 = Integer.MAX_VALUE;
        } else {
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
            try {
                rectH = cameraInfoInternal.h();
            } catch (NullPointerException unused) {
                rectH = null;
            }
            ac.i iVar = new ac.i(cameraInfoInternal, rectH != null ? i0.q.g(rectH) : null);
            Iterator it3 = newUseCases.iterator();
            boolean z11 = false;
            while (it3.hasNext()) {
                q2 q2Var2 = (q2) it3.next();
                Object obj = mapV.get(q2Var2);
                if (obj == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                l0.e eVar2 = (l0.e) obj;
                x2 x2VarP = q2Var2.p(cameraInfoInternal, eVar2.f27719a, eVar2.f27720b);
                Intrinsics.checkNotNullExpressionValue(x2VarP, "mergeConfigs(...)");
                linkedHashMap3.put(x2VarP, q2Var2);
                List listE = iVar.e(x2VarP);
                Intrinsics.checkNotNullExpressionValue(listE, "getSortedSupportedOutputSizes(...)");
                linkedHashMap4.put(x2VarP, listE);
                if (x2VarP.q() == 2) {
                    z11 = true;
                }
            }
            u0 u0Var2 = (u0) this.f20376d;
            if (u0Var2 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            ArrayList arrayList2 = new ArrayList(map.keySet());
            Iterator it4 = newUseCases.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    z10 = false;
                    break;
                }
                if (l0.f.z((q2) it4.next())) {
                    z10 = true;
                    break;
                }
            }
            f2.g.a("No new use cases to be bound.", !linkedHashMap4.isEmpty());
            d2 d2Var2 = (d2) u0Var2.f33298b.get(strE2);
            f2.g.a("No such camera id in supported combination list: " + strE2, d2Var2 != null);
            g0.q2 q2VarJ = d2Var2.j(i, arrayList2, linkedHashMap4, z11, z10, z5);
            Intrinsics.checkNotNullExpressionValue(q2VarJ, "getSuggestedStreamSpecs(...)");
            HashMap map2 = q2VarJ.f19723a;
            HashMap map3 = q2VarJ.f19724b;
            i10 = q2VarJ.f19725c;
            for (Map.Entry entry : linkedHashMap3.entrySet()) {
                Object value = entry.getValue();
                Object obj2 = map2.get(entry.getKey());
                if (obj2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                streamSpecs.put(value, obj2);
            }
            for (Map.Entry entry2 : map3.entrySet()) {
                if (map.containsKey(entry2.getKey())) {
                    Object obj3 = map.get(entry2.getKey());
                    if (obj3 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    streamSpecs.put(obj3, entry2.getValue());
                }
            }
        }
        Intrinsics.checkNotNullParameter(streamSpecs, "streamSpecs");
        Object first = pair.first;
        Intrinsics.checkNotNullExpressionValue(first, "first");
        return new l0.j(j0.i((Map) first, streamSpecs), i10);
    }

    public void z(String str, PrintWriter printWriter) {
        d dVar = (d) this.f20376d;
        if (dVar.f20371b.f20343d <= 0) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Loaders:");
        String str2 = str + "    ";
        int i = 0;
        while (true) {
            h1.j jVar = dVar.f20371b;
            if (i >= jVar.f20343d) {
                return;
            }
            a aVar = (a) jVar.f20342c[i];
            printWriter.print(str);
            printWriter.print("  #");
            printWriter.print(dVar.f20371b.f20341b[i]);
            printWriter.print(": ");
            printWriter.println(aVar.toString());
            printWriter.print(str2);
            printWriter.print("mId=");
            printWriter.print(0);
            printWriter.print(" mArgs=");
            printWriter.println((Object) null);
            printWriter.print(str2);
            printWriter.print("mLoader=");
            printWriter.println(aVar.f20364n);
            ka.d dVar2 = aVar.f20364n;
            String str3 = str2 + "  ";
            dVar2.getClass();
            printWriter.print(str3);
            printWriter.print("mId=");
            printWriter.print(0);
            printWriter.print(" mListener=");
            printWriter.println(dVar2.f27307a);
            if (dVar2.f27308b || dVar2.f27311e) {
                printWriter.print(str3);
                printWriter.print("mStarted=");
                printWriter.print(dVar2.f27308b);
                printWriter.print(" mContentChanged=");
                printWriter.print(dVar2.f27311e);
                printWriter.print(" mProcessingChange=");
                printWriter.println(false);
            }
            if (dVar2.f27309c || dVar2.f27310d) {
                printWriter.print(str3);
                printWriter.print("mAbandoned=");
                printWriter.print(dVar2.f27309c);
                printWriter.print(" mReset=");
                printWriter.println(dVar2.f27310d);
            }
            if (dVar2.f27313g != null) {
                printWriter.print(str3);
                printWriter.print("mTask=");
                printWriter.print(dVar2.f27313g);
                printWriter.print(" waiting=");
                dVar2.f27313g.getClass();
                printWriter.println(false);
            }
            if (dVar2.f27314h != null) {
                printWriter.print(str3);
                printWriter.print("mCancellingTask=");
                printWriter.print(dVar2.f27314h);
                printWriter.print(" waiting=");
                dVar2.f27314h.getClass();
                printWriter.println(false);
            }
            if (aVar.f20366p != null) {
                printWriter.print(str2);
                printWriter.print("mCallbacks=");
                printWriter.println(aVar.f20366p);
                b bVar = aVar.f20366p;
                bVar.getClass();
                printWriter.print(str2 + "  ");
                printWriter.print("mDeliveredData=");
                printWriter.println(bVar.f20368b);
            }
            printWriter.print(str2);
            printWriter.print("mData=");
            ka.d dVar3 = aVar.f20364n;
            Object objD = aVar.d();
            dVar3.getClass();
            StringBuilder sb2 = new StringBuilder(64);
            if (objD == null) {
                sb2.append("null");
            } else {
                Class<?> cls = objD.getClass();
                sb2.append(cls.getSimpleName());
                sb2.append("{");
                sb2.append(Integer.toHexString(System.identityHashCode(cls)));
                sb2.append("}");
            }
            printWriter.println(sb2.toString());
            printWriter.print(str2);
            printWriter.print("mStarted=");
            printWriter.println(aVar.f1552c > 0);
            i++;
        }
    }

    public /* synthetic */ e(int i, Object obj, Object obj2) {
        this.f20374b = i;
        this.f20375c = obj;
        this.f20376d = obj2;
    }

    public /* synthetic */ e(int i, Object obj, Object obj2, boolean z5) {
        this.f20374b = i;
        this.f20376d = obj;
        this.f20375c = obj2;
    }

    public e(ki.b bVar, b1 b1Var) {
        this.f20374b = 24;
        this.f20375c = bVar;
        this.f20376d = b1Var;
        b1Var.f45c = new b1(27, this);
    }

    public e(Context context, zf zfVar, i8.b bVar, nd ndVar) {
        this.f20374b = 11;
        this.f20375c = context;
        this.f20376d = bVar;
    }

    public e(l lVar) {
        this.f20374b = 3;
        this.f20376d = lVar;
        this.f20375c = new HashMap();
    }

    public e(View view, InputMethodManager inputMethodManager, b1 b1Var) {
        this.f20374b = 18;
        if (Build.VERSION.SDK_INT >= 33) {
            view.setAutoHandwritingEnabled(false);
        }
        this.f20376d = view;
        this.f20375c = inputMethodManager;
        b1Var.f45c = this;
    }

    public e(k1.d dVar) {
        this.f20374b = 21;
        this.f20376d = dVar;
    }

    public e(u uVar, z0 store) {
        this.f20374b = 0;
        this.f20375c = uVar;
        Intrinsics.checkNotNullParameter(store, "store");
        c factory = d.f20370d;
        Intrinsics.checkNotNullParameter(factory, "factory");
        f3.a defaultCreationExtras = f3.a.f16575b;
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        g gVar = new g(store, factory, defaultCreationExtras);
        Intrinsics.checkNotNullParameter(d.class, "modelClass");
        Intrinsics.checkNotNullParameter(d.class, "<this>");
        kotlin.jvm.internal.i modelClass = g0.a(d.class);
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        String strB = modelClass.b();
        if (strB != null) {
            this.f20376d = (d) gVar.C(modelClass, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public e(yd.a aVar) {
        this.f20374b = 2;
        this.f20376d = Collections.synchronizedMap(new HashMap());
        this.f20375c = aVar;
    }

    public e(zh.b bVar, int i) {
        this.f20374b = i;
        switch (i) {
            case 5:
                fe.c cVar = new fe.c(18, this);
                ii.q qVar = new ii.q(bVar, "flutter/platform", ii.l.f21314a, null);
                this.f20375c = qVar;
                qVar.b(cVar);
                break;
            case 6:
                b1 b1Var = new b1(16, this);
                ii.q qVar2 = new ii.q(bVar, "flutter/platform_views_2", x.f21321b, null);
                this.f20375c = qVar2;
                qVar2.b(b1Var);
                break;
            case 7:
                v7.f fVar = new v7.f(18, this);
                ii.q qVar3 = new ii.q(bVar, "flutter/platform_views", x.f21321b, null);
                this.f20375c = qVar3;
                qVar3.b(fVar);
                break;
            case 8:
            case 9:
            default:
                fe.c cVar2 = new fe.c(17, this);
                ii.q qVar4 = new ii.q(bVar, "flutter/localization", ii.l.f21314a, null);
                this.f20375c = qVar4;
                qVar4.b(cVar2);
                break;
            case 10:
                fe.c cVar3 = new fe.c(21, this);
                ii.q qVar5 = new ii.q(bVar, "flutter/textinput", ii.l.f21314a, null);
                this.f20375c = qVar5;
                qVar5.b(cVar3);
                break;
        }
    }

    public e(zh.b bVar, PackageManager packageManager) {
        this.f20374b = 8;
        l lVar = new l(20, this);
        this.f20375c = packageManager;
        new ii.q(bVar, "flutter/processtext", x.f21321b, null).b(lVar);
    }

    public e(y0 useCaseConfigFactory) {
        this.f20374b = 28;
        Intrinsics.checkNotNullParameter(useCaseConfigFactory, "useCaseConfigFactory");
        this.f20375c = useCaseConfigFactory;
        this.f20376d = null;
    }

    public e() {
        this.f20374b = 23;
        this.f20375c = new SparseIntArray();
        this.f20376d = new SparseIntArray();
    }
}
