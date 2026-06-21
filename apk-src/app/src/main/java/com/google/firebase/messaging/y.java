package com.google.firebase.messaging;

import a0.l1;
import android.R;
import android.accounts.Account;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.SpannableString;
import android.text.style.LocaleSpan;
import android.text.style.TtsSpan;
import android.text.style.URLSpan;
import android.util.Base64;
import android.util.JsonWriter;
import android.util.Log;
import android.util.Range;
import android.util.Size;
import com.google.android.gms.internal.ads.om1;
import com.google.android.gms.internal.auth.n0;
import com.google.android.gms.internal.consent_sdk.g7;
import com.google.android.gms.internal.consent_sdk.h7;
import com.google.android.gms.internal.consent_sdk.n1;
import com.google.android.gms.internal.consent_sdk.r0;
import g0.b1;
import g0.c1;
import g0.l0;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import io.flutter.embedding.engine.FlutterJNI;
import io.sentry.SentryLogEvent;
import io.sentry.protocol.Message;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import ni.m1;
import t.y0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class y implements h7, b1, ha.d, u9.e, n5.m {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static y f14898f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f14899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f14900c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f14901d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f14902e;

    public /* synthetic */ y(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f14899b = obj;
        this.f14900c = obj2;
        this.f14901d = obj3;
        this.f14902e = obj4;
    }

    public static g0.j c(y yVar, int i, int i10, int i11) {
        g0.j jVar = new g0.j(2, "video/avc", i11, 30, i, i10, -1, 8, 0, 0);
        Intrinsics.checkNotNullExpressionValue(jVar, "create(...)");
        return jVar;
    }

    public static synchronized y g() {
        try {
            if (f14898f == null) {
                f14898f = new y(0);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f14898f;
    }

    public b8.a A(com.google.android.gms.internal.consent_sdk.y yVar) throws n1 {
        int i;
        String str;
        com.google.android.gms.internal.consent_sdk.g gVar = (com.google.android.gms.internal.consent_sdk.g) this.f14901d;
        com.google.android.gms.internal.consent_sdk.a0 a0Var = (com.google.android.gms.internal.consent_sdk.a0) this.f14902e;
        int i10 = yVar.f13614g;
        gVar.f13391b.edit().putBoolean("is_pub_misconfigured", i10 == 8).commit();
        int i11 = i10 - 1;
        if (i10 == 0) {
            throw null;
        }
        int i12 = 3;
        switch (i11) {
            case 1:
            case 2:
            case 3:
                i = 3;
                break;
            case 4:
                i = 2;
                break;
            case 5:
                i = 1;
                break;
            case 6:
                throw new n1(1, "Invalid response from server: ".concat(String.valueOf(yVar.f13610c)));
            case 7:
                throw new n1(3, "Publisher misconfiguration: ".concat(String.valueOf(yVar.f13610c)));
            default:
                throw new n1(1, "Invalid response from server.");
        }
        int i13 = yVar.f13615h;
        int i14 = i13 - 1;
        if (i13 == 0) {
            throw null;
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new n1(1, "Invalid response from server.");
            }
            i12 = 2;
        }
        String str2 = yVar.f13608a;
        com.google.android.gms.internal.consent_sdk.p pVar = str2 == null ? null : new com.google.android.gms.internal.consent_sdk.p(yVar.f13609b, str2);
        a0Var.f13314a.set(yVar.f13613f);
        gVar.f13391b.edit().putStringSet("stored_info", new HashSet(yVar.f13611d)).commit();
        for (com.google.android.gms.internal.consent_sdk.x xVar : yVar.f13612e) {
            int i15 = xVar.f13605b;
            int i16 = i15 - 1;
            if (i15 == 0) {
                throw null;
            }
            if (i16 == 0) {
                str = null;
            } else if (i16 == 1) {
                str = "write";
            } else {
                if (i16 != 2) {
                    throw new RuntimeException(null, null);
                }
                str = "clear";
            }
            if (str != null) {
                r0 r0Var = (r0) this.f14899b;
                String str3 = xVar.f13604a;
                com.google.android.gms.internal.consent_sdk.g0[] g0VarArr = {(s7.g) this.f14900c};
                r0Var.getClass();
                r0Var.f13537a.execute(new aa.y(str, str3, g0VarArr, 4));
            }
        }
        return new b8.a(i, i12, pVar);
    }

    public com.google.android.gms.internal.measurement.n B(com.google.android.gms.internal.measurement.d dVar) {
        com.google.android.gms.internal.measurement.n nVarC = com.google.android.gms.internal.measurement.n.B1;
        Iterator itQ = dVar.q();
        while (itQ.hasNext()) {
            nVarC = ((com.google.android.gms.internal.measurement.t) this.f14900c).c(this, dVar.t(((Integer) itQ.next()).intValue()));
            if (nVarC instanceof com.google.android.gms.internal.measurement.f) {
                break;
            }
        }
        return nVarC;
    }

    public y C() {
        return new y(this, (com.google.android.gms.internal.measurement.t) this.f14900c);
    }

    public boolean D(String str) {
        if (((HashMap) this.f14901d).containsKey(str)) {
            return true;
        }
        y yVar = (y) this.f14899b;
        if (yVar != null) {
            return yVar.D(str);
        }
        return false;
    }

    public void E(String str, com.google.android.gms.internal.measurement.n nVar) {
        y yVar;
        HashMap map = (HashMap) this.f14901d;
        if (!map.containsKey(str) && (yVar = (y) this.f14899b) != null && yVar.D(str)) {
            yVar.E(str, nVar);
        } else {
            if (((HashMap) this.f14902e).containsKey(str)) {
                return;
            }
            if (nVar == null) {
                map.remove(str);
            } else {
                map.put(str, nVar);
            }
        }
    }

    public void F(String str, com.google.android.gms.internal.measurement.n nVar) {
        HashMap map = (HashMap) this.f14901d;
        if (((HashMap) this.f14902e).containsKey(str)) {
            return;
        }
        if (nVar == null) {
            map.remove(str);
        } else {
            map.put(str, nVar);
        }
    }

    public com.google.android.gms.internal.measurement.n G(String str) {
        HashMap map = (HashMap) this.f14901d;
        if (map.containsKey(str)) {
            return (com.google.android.gms.internal.measurement.n) map.get(str);
        }
        y yVar = (y) this.f14899b;
        if (yVar != null) {
            return yVar.G(str);
        }
        throw new IllegalArgumentException(om1.x(str, " is not defined"));
    }

    public SpannableString a() {
        if (((String) this.f14899b) == null) {
            return null;
        }
        SpannableString spannableString = new SpannableString((String) this.f14899b);
        List<io.flutter.view.k> list = (List) this.f14900c;
        if (list != null) {
            for (io.flutter.view.k kVar : list) {
                int iM = t.z.m(kVar.f25872c);
                if (iM == 0) {
                    spannableString.setSpan(new TtsSpan.Builder("android.type.verbatim").build(), kVar.f25870a, kVar.f25871b, 0);
                } else if (iM == 1) {
                    spannableString.setSpan(new LocaleSpan(Locale.forLanguageTag(((io.flutter.view.i) kVar).f25869d)), kVar.f25870a, kVar.f25871b, 0);
                }
            }
        }
        String str = (String) this.f14902e;
        if (str != null && !str.isEmpty()) {
            spannableString.setSpan(new URLSpan((String) this.f14902e), 0, ((String) this.f14899b).length(), 0);
        }
        String str2 = (String) this.f14901d;
        if (str2 != null && !str2.isEmpty()) {
            spannableString.setSpan(new LocaleSpan(Locale.forLanguageTag((String) this.f14901d)), 0, ((String) this.f14899b).length(), 0);
        }
        return spannableString;
    }

    public x0.k b() {
        String strX = ((x0.p) this.f14899b) == null ? " qualitySelector" : "";
        if (((Integer) this.f14900c) == null) {
            strX = strX.concat(" encodeFrameRate");
        }
        if (((Range) this.f14901d) == null) {
            strX = om1.x(strX, " bitrate");
        }
        if (((Integer) this.f14902e) == null) {
            strX = om1.x(strX, " aspectRatio");
        }
        if (strX.isEmpty()) {
            return new x0.k((x0.p) this.f14899b, ((Integer) this.f14900c).intValue(), (Range) this.f14901d, ((Integer) this.f14902e).intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(strX));
    }

    public void d(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((h1.i) this.f14900c).get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                d(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object e(oj.c r7) throws java.lang.Throwable {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f14902e
            p2.e0 r0 = (p2.e0) r0
            boolean r1 = r7 instanceof p2.j
            if (r1 == 0) goto L17
            r1 = r7
            p2.j r1 = (p2.j) r1
            int r2 = r1.f30989o
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f30989o = r2
            goto L1c
        L17:
            p2.j r1 = new p2.j
            r1.<init>(r6, r7)
        L1c:
            java.lang.Object r7 = r1.f30987m
            nj.a r2 = nj.a.f29512b
            int r3 = r1.f30989o
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L3e
            if (r3 == r5) goto L38
            if (r3 != r4) goto L30
            com.google.firebase.messaging.y r0 = r1.f30986l
            com.google.android.gms.internal.measurement.h5.E(r7)
            goto L64
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L38:
            com.google.firebase.messaging.y r0 = r1.f30986l
            com.google.android.gms.internal.measurement.h5.E(r7)
            goto L74
        L3e:
            com.google.android.gms.internal.measurement.h5.E(r7)
            java.lang.Object r7 = r6.f14901d
            java.util.List r7 = (java.util.List) r7
            if (r7 == 0) goto L67
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L4e
            goto L67
        L4e:
            p2.v0 r7 = r0.g()
            p2.m r3 = new p2.m
            r5 = 0
            r3.<init>(r0, r6, r5)
            r1.f30986l = r6
            r1.f30989o = r4
            java.lang.Object r7 = r7.b(r3, r1)
            if (r7 != r2) goto L63
            goto L72
        L63:
            r0 = r6
        L64:
            p2.d r7 = (p2.d) r7
            goto L76
        L67:
            r1.f30986l = r6
            r1.f30989o = r5
            r7 = 0
            java.lang.Object r7 = p2.e0.f(r0, r7, r1)
            if (r7 != r2) goto L73
        L72:
            return r2
        L73:
            r0 = r6
        L74:
            p2.d r7 = (p2.d) r7
        L76:
            java.lang.Object r0 = r0.f14902e
            p2.e0 r0 = (p2.e0) r0
            m7.a r0 = r0.f30958h
            r0.u(r7)
            kotlin.Unit r7 = kotlin.Unit.f27471a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.y.e(oj.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b8 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void f(dl.g r12) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.y.f(dl.g):void");
    }

    @Override // ha.d
    public Object h(IBinder iBinder) throws IOException {
        n0 rVar;
        Account account = (Account) this.f14900c;
        String str = (String) this.f14899b;
        Bundle bundle = (Bundle) this.f14901d;
        Context context = (Context) this.f14902e;
        int i = com.google.android.gms.internal.auth.f0.f13206c;
        if (iBinder == null) {
            rVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
            rVar = iInterfaceQueryLocalInterface instanceof n0 ? (n0) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.auth.r(iBinder, "com.google.android.auth.IAuthManagerService", 2);
        }
        com.google.android.gms.internal.auth.r rVar2 = (com.google.android.gms.internal.auth.r) rVar;
        rVar2.getClass();
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(rVar2.f2257d);
        com.google.android.gms.internal.auth.d.b(parcelObtain, account);
        parcelObtain.writeString(str);
        com.google.android.gms.internal.auth.d.b(parcelObtain, bundle);
        Parcel parcelE0 = rVar2.E0(parcelObtain, 5);
        Bundle bundle2 = (Bundle) com.google.android.gms.internal.auth.d.a(parcelE0, Bundle.CREATOR);
        parcelE0.recycle();
        if (bundle2 != null) {
            return ha.a.c(context, bundle2);
        }
        throw new IOException("Service call returned null");
    }

    @Override // g0.b1
    public boolean k(int i) {
        return l(i) != null;
    }

    public c1 l(int i) {
        g0.i iVarE;
        int i10;
        Object next;
        int i11;
        g0.j jVarC;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f14902e;
        if (linkedHashMap.containsKey(Integer.valueOf(i))) {
            return (c1) linkedHashMap.get(Integer.valueOf(i));
        }
        Iterator it = ((List) this.f14900c).iterator();
        while (true) {
            iVarE = null;
            if (!it.hasNext()) {
                i10 = i;
                next = null;
                break;
            }
            next = it.next();
            x0.g gVar = (x0.g) next;
            Intrinsics.c(gVar, "null cannot be cast to non-null type androidx.camera.video.Quality.ConstantQuality");
            i10 = i;
            if (gVar.f35592a == i10) {
                break;
            }
        }
        x0.g gVar2 = next instanceof x0.g ? (x0.g) next : null;
        if (gVar2 == null) {
            jVarC = null;
        } else {
            for (Size size : gVar2.f35595d) {
                if (((List) ((ij.p) this.f14901d).getValue()).contains(size)) {
                    int width = size.getWidth();
                    int height = size.getHeight();
                    if (gVar2.equals(x0.g.f35587h)) {
                        i11 = 40000000;
                    } else if (gVar2.equals(x0.g.f35586g)) {
                        i11 = 10000000;
                    } else if (gVar2.equals(x0.g.f35585f)) {
                        i11 = 4000000;
                    } else {
                        if (!gVar2.equals(x0.g.f35584e)) {
                            throw new IllegalArgumentException("Undefined bitrate for quality: " + gVar2);
                        }
                        i11 = 2000000;
                    }
                    jVarC = c(this, width, height, i11);
                    e1.h0 h0VarA = e1.i0.a("video/avc");
                    if (h0VarA != null && h0VarA.a(width, height)) {
                        Integer num = (Integer) h0VarA.d().clamp(Integer.valueOf(i11));
                        if (num == null || num.intValue() != i11) {
                            Intrinsics.b(num);
                            jVarC = c(this, width, height, num.intValue());
                        }
                    } else {
                        jVarC = null;
                    }
                    if (jVarC != null) {
                        break;
                    }
                }
            }
            jVarC = null;
        }
        if (jVarC != null) {
            g0.h hVar = new g0.h(3, 96000, 44100, 1, 2, "audio/mp4a-latm");
            Intrinsics.checkNotNullExpressionValue(hVar, "create(...)");
            iVarE = g0.i.e(60, 2, kotlin.collections.r.c(hVar), kotlin.collections.r.c(jVarC));
            Intrinsics.checkNotNullExpressionValue(iVarE, "create(...)");
        }
        linkedHashMap.put(Integer.valueOf(i10), iVarE);
        return iVarE;
    }

    public File m(Context context) {
        ((ob.y) this.f14900c).getClass();
        return new File(context.getDir("lib", 0), System.mapLibraryName(PluginErrorDetails.Platform.FLUTTER));
    }

    public boolean n(Context context) {
        if (((Boolean) this.f14901d) == null) {
            this.f14901d = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!((Boolean) this.f14900c).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.f14901d).booleanValue();
    }

    public boolean o(Context context) {
        if (((Boolean) this.f14900c) == null) {
            this.f14900c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!((Boolean) this.f14900c).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.f14900c).booleanValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:40:0x00af. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0262  */
    @Override // n5.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void p(byte[] r27, int r28, int r29, n5.l r30, m3.g r31) {
        /*
            Method dump skipped, instruction units count: 668
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.y.p(byte[], int, int, n5.l, m3.g):void");
    }

    @Override // u9.e
    public void q(JsonWriter jsonWriter) throws IOException {
        String str = (String) this.f14899b;
        String str2 = (String) this.f14900c;
        Map map = (Map) this.f14901d;
        byte[] bArr = (byte[]) this.f14902e;
        jsonWriter.name(Message.JsonKeys.PARAMS).beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("uri").value(str);
        jsonWriter.name("verb").value(str2);
        jsonWriter.endObject();
        u9.f.d(jsonWriter, map);
        if (bArr != null) {
            jsonWriter.name(SentryLogEvent.JsonKeys.BODY).value(Base64.encodeToString(bArr, 0));
        }
        jsonWriter.endObject();
    }

    public void r(String str, Object... objArr) {
        String str2 = String.format(Locale.US, str, objArr);
        if (((yf.a) this.f14902e) != null) {
            FlutterJNI.lambda$loadLibrary$0(str2);
        }
    }

    @Override // n5.m
    public int s() {
        return 2;
    }

    public void t(l1 l1Var) {
        m1 m1Var = (m1) this.f14901d;
        ni.c cVar = (ni.c) this.f14902e;
        int i = l1Var.f159b;
        cVar.getClass();
        m1Var.f29441b.f29437a.l(new ni.a(2, m1Var, i != 1 ? i != 2 ? i != 3 ? i != 4 ? "An unknown error has occurred while attempting to take a picture. Check the logs for more details." : "The ImageCapture use case was bound to an invalid camera by the Flutter camera plugin. If you see this error, please file an issue if you cannot find one that already exists: https://github.com/flutter/flutter/issues/." : "Image capture failed due to the camera being closed." : "The camera framework failed to fulfill the image capture request." : "An error occurred while attempting to save the captured image to a file."));
        ni.l1.b((fj.z) this.f14900c, l1Var);
    }

    @Override // g0.b1
    public c1 u(int i) {
        return l(i);
    }

    public void v(String str) {
        Bundle bundle = new Bundle();
        synchronized (this.f14899b) {
            try {
                try {
                    ((b.b) ((b.d) this.f14900c)).l0((q.f) this.f14901d, str, bundle);
                } catch (RemoteException unused) {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object w(oj.c r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof p2.r0
            if (r0 == 0) goto L13
            r0 = r8
            p2.r0 r0 = (p2.r0) r0
            int r1 = r0.f31057p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31057p = r1
            goto L18
        L13:
            p2.r0 r0 = new p2.r0
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f31055n
            nj.a r1 = nj.a.f29512b
            int r2 = r0.f31057p
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L44
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            pk.a r1 = r0.f31054m
            com.google.firebase.messaging.y r0 = r0.f31053l
            com.google.android.gms.internal.measurement.h5.E(r8)     // Catch: java.lang.Throwable -> L30
            goto L99
        L30:
            r8 = move-exception
            goto La8
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3b:
            pk.a r2 = r0.f31054m
            com.google.firebase.messaging.y r4 = r0.f31053l
            com.google.android.gms.internal.measurement.h5.E(r8)
            r8 = r2
            goto L6d
        L44:
            com.google.android.gms.internal.measurement.h5.E(r8)
            java.lang.Object r8 = r7.f14900c
            hk.r r8 = (hk.r) r8
            r8.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = hk.k1.f20683b
            java.lang.Object r8 = r2.get(r8)
            boolean r8 = r8 instanceof hk.y0
            if (r8 != 0) goto L5b
            kotlin.Unit r8 = kotlin.Unit.f27471a
            return r8
        L5b:
            java.lang.Object r8 = r7.f14899b
            pk.c r8 = (pk.c) r8
            r0.f31053l = r7
            r0.f31054m = r8
            r0.f31057p = r4
            java.lang.Object r2 = r8.c(r0)
            if (r2 != r1) goto L6c
            goto L96
        L6c:
            r4 = r7
        L6d:
            java.lang.Object r2 = r4.f14900c     // Catch: java.lang.Throwable -> L86
            hk.r r2 = (hk.r) r2     // Catch: java.lang.Throwable -> L86
            r2.getClass()     // Catch: java.lang.Throwable -> L86
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = hk.k1.f20683b     // Catch: java.lang.Throwable -> L86
            java.lang.Object r2 = r6.get(r2)     // Catch: java.lang.Throwable -> L86
            boolean r2 = r2 instanceof hk.y0     // Catch: java.lang.Throwable -> L86
            if (r2 != 0) goto L8a
            kotlin.Unit r0 = kotlin.Unit.f27471a     // Catch: java.lang.Throwable -> L86
            pk.c r8 = (pk.c) r8
            r8.e(r5)
            return r0
        L86:
            r0 = move-exception
            r1 = r8
            r8 = r0
            goto La8
        L8a:
            r0.f31053l = r4     // Catch: java.lang.Throwable -> L86
            r0.f31054m = r8     // Catch: java.lang.Throwable -> L86
            r0.f31057p = r3     // Catch: java.lang.Throwable -> L86
            java.lang.Object r0 = r4.e(r0)     // Catch: java.lang.Throwable -> L86
            if (r0 != r1) goto L97
        L96:
            return r1
        L97:
            r1 = r8
            r0 = r4
        L99:
            java.lang.Object r8 = r0.f14900c     // Catch: java.lang.Throwable -> L30
            hk.r r8 = (hk.r) r8     // Catch: java.lang.Throwable -> L30
            kotlin.Unit r0 = kotlin.Unit.f27471a     // Catch: java.lang.Throwable -> L30
            r8.H(r0)     // Catch: java.lang.Throwable -> L30
            pk.c r1 = (pk.c) r1
            r1.e(r5)
            return r0
        La8:
            pk.c r1 = (pk.c) r1
            r1.e(r5)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.y.w(oj.c):java.lang.Object");
    }

    public void x() {
        int itemCount;
        ni.i iVar = (ni.i) this.f14900c;
        xi.d dVar = (xi.d) this.f14899b;
        y6.m mVar = (y6.m) this.f14902e;
        int i = R.id.accessibilityActionPageLeft;
        g2.n0.h(mVar, R.id.accessibilityActionPageLeft);
        g2.n0.f(mVar, 0);
        g2.n0.h(mVar, R.id.accessibilityActionPageRight);
        g2.n0.f(mVar, 0);
        g2.n0.h(mVar, R.id.accessibilityActionPageUp);
        g2.n0.f(mVar, 0);
        g2.n0.h(mVar, R.id.accessibilityActionPageDown);
        g2.n0.f(mVar, 0);
        if (mVar.getAdapter() == null || (itemCount = mVar.getAdapter().getItemCount()) == 0 || !mVar.f36523s) {
            return;
        }
        if (mVar.getOrientation() != 0) {
            if (mVar.f36510e < itemCount - 1) {
                g2.n0.i(mVar, new h2.c(R.id.accessibilityActionPageDown), dVar);
            }
            if (mVar.f36510e > 0) {
                g2.n0.i(mVar, new h2.c(R.id.accessibilityActionPageUp), iVar);
                return;
            }
            return;
        }
        boolean z5 = mVar.f36513h.getLayoutDirection() == 1;
        int i10 = z5 ? 16908360 : 16908361;
        if (z5) {
            i = 16908361;
        }
        if (mVar.f36510e < itemCount - 1) {
            g2.n0.i(mVar, new h2.c(i10), dVar);
        }
        if (mVar.f36510e > 0) {
            g2.n0.i(mVar, new h2.c(i), iVar);
        }
    }

    public com.google.android.gms.internal.measurement.n y(com.google.android.gms.internal.measurement.n nVar) {
        return ((com.google.android.gms.internal.measurement.t) this.f14900c).c(this, nVar);
    }

    @Override // com.google.android.gms.internal.consent_sdk.i7
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public y j() {
        return new y((r0) ((g7) this.f14899b).j(), ((com.google.android.gms.internal.consent_sdk.f) this.f14900c).j(), (com.google.android.gms.internal.consent_sdk.g) ((g7) this.f14901d).j(), (com.google.android.gms.internal.consent_sdk.a0) ((g7) this.f14902e).j());
    }

    public y(y yVar, com.google.android.gms.internal.measurement.t tVar) {
        this.f14901d = new HashMap();
        this.f14902e = new HashMap();
        this.f14899b = yVar;
        this.f14900c = tVar;
    }

    public y(l0 cameraRepository, y.a cameraCoordinator, y0 useCaseConfigFactory, h3.e streamSpecsCalculator) {
        Intrinsics.checkNotNullParameter(cameraRepository, "cameraRepository");
        Intrinsics.checkNotNullParameter(cameraCoordinator, "cameraCoordinator");
        Intrinsics.checkNotNullParameter(useCaseConfigFactory, "useCaseConfigFactory");
        Intrinsics.checkNotNullParameter(streamSpecsCalculator, "streamSpecsCalculator");
        this.f14899b = cameraRepository;
        this.f14900c = cameraCoordinator;
        this.f14901d = useCaseConfigFactory;
        this.f14902e = streamSpecsCalculator;
    }

    public y(Typeface typeface, v2.b bVar) {
        int i;
        int i10;
        int i11;
        int i12;
        this.f14902e = typeface;
        this.f14899b = bVar;
        this.f14901d = new u2.n(1024);
        int iA = bVar.a(6);
        if (iA != 0) {
            int i13 = iA + bVar.f19836b;
            i = ((ByteBuffer) bVar.f19839e).getInt(((ByteBuffer) bVar.f19839e).getInt(i13) + i13);
        } else {
            i = 0;
        }
        this.f14900c = new char[i * 2];
        int iA2 = bVar.a(6);
        if (iA2 != 0) {
            int i14 = iA2 + bVar.f19836b;
            i10 = ((ByteBuffer) bVar.f19839e).getInt(((ByteBuffer) bVar.f19839e).getInt(i14) + i14);
        } else {
            i10 = 0;
        }
        for (int i15 = 0; i15 < i10; i15++) {
            u2.k kVar = new u2.k(this, i15);
            v2.a aVarB = kVar.b();
            int iA3 = aVarB.a(4);
            Character.toChars(iA3 != 0 ? ((ByteBuffer) aVarB.f19839e).getInt(iA3 + aVarB.f19836b) : 0, (char[]) this.f14900c, i15 * 2);
            v2.a aVarB2 = kVar.b();
            int iA4 = aVarB2.a(16);
            if (iA4 != 0) {
                int i16 = iA4 + aVarB2.f19836b;
                i11 = ((ByteBuffer) aVarB2.f19839e).getInt(((ByteBuffer) aVarB2.f19839e).getInt(i16) + i16);
            } else {
                i11 = 0;
            }
            f2.g.a("invalid metadata codepoint length", i11 > 0);
            u2.n nVar = (u2.n) this.f14901d;
            v2.a aVarB3 = kVar.b();
            int iA5 = aVarB3.a(16);
            if (iA5 != 0) {
                int i17 = iA5 + aVarB3.f19836b;
                i12 = ((ByteBuffer) aVarB3.f19839e).getInt(((ByteBuffer) aVarB3.f19839e).getInt(i17) + i17);
            } else {
                i12 = 0;
            }
            nVar.a(kVar, 0, i12 - 1);
        }
    }

    public y(int i) {
        switch (i) {
            case 14:
                this.f14899b = new f2.c(10);
                this.f14900c = new h1.i(0);
                this.f14901d = new ArrayList();
                this.f14902e = new HashSet();
                break;
            case 15:
                ob.y yVar = new ob.y(28);
                ob.a0 a0Var = new ob.a0(27);
                this.f14899b = new HashSet();
                this.f14900c = yVar;
                this.f14901d = a0Var;
                break;
            case 23:
                this.f14902e = new ArrayDeque();
                this.f14900c = new ArrayDeque();
                this.f14901d = new ArrayDeque();
                break;
            default:
                this.f14899b = null;
                this.f14900c = null;
                this.f14901d = null;
                this.f14902e = new ArrayDeque();
                break;
        }
    }
}
