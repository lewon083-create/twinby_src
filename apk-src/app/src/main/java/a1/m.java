package a1;

import a0.e2;
import a0.i0;
import a0.l2;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import android.util.Range;
import com.google.android.gms.internal.ads.al;
import com.google.android.gms.internal.ads.as0;
import com.google.android.gms.internal.ads.k81;
import com.google.android.gms.internal.ads.mw;
import com.google.android.gms.internal.ads.om1;
import com.google.android.gms.internal.ads.tw;
import com.google.android.gms.internal.ads.vl;
import com.google.android.gms.internal.ads.xr0;
import com.google.android.gms.internal.measurement.b4;
import com.vk.api.sdk.exceptions.VKApiCodes;
import dev.fluttercommunity.plus.share.SharePlusPendingIntent;
import g0.a1;
import g0.f0;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.CollectionsKt;
import kotlin.collections.j0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.a0;
import m3.z;
import org.json.JSONException;
import org.json.JSONObject;
import t.x1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements k81, n5.e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f361g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f363c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f364d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f365e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f366f;

    public /* synthetic */ m(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.f362b = obj;
        this.f363c = obj2;
        this.f364d = obj3;
        this.f365e = obj4;
        this.f366f = obj5;
    }

    public static m j(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        m mVar = new m();
        mVar.f365e = new ArrayDeque();
        mVar.f362b = sharedPreferences;
        mVar.f363c = "topic_operation_queue";
        mVar.f364d = StringUtils.COMMA;
        mVar.f366f = scheduledThreadPoolExecutor;
        synchronized (((ArrayDeque) mVar.f365e)) {
            try {
                ((ArrayDeque) mVar.f365e).clear();
                String string = ((SharedPreferences) mVar.f362b).getString((String) mVar.f363c, "");
                if (!TextUtils.isEmpty(string) && string.contains((String) mVar.f364d)) {
                    String[] strArrSplit = string.split((String) mVar.f364d, -1);
                    if (strArrSplit.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : strArrSplit) {
                        if (!TextUtils.isEmpty(str)) {
                            ((ArrayDeque) mVar.f365e).add(str);
                        }
                    }
                    return mVar;
                }
                return mVar;
            } finally {
            }
        }
    }

    public static String n(String str) {
        if (str == null || !StringsKt.y(str, "/", false)) {
            return "*";
        }
        String strSubstring = str.substring(0, StringsKt.C(str, "/", 0, false, 6));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static void p(Throwable th2) {
        Log.e("WebChromeClientImpl", th2.getClass().getSimpleName() + ", Message: " + th2.getMessage() + ", Stacktrace: " + Log.getStackTraceString(th2));
    }

    public n a() {
        if (!"".isEmpty()) {
            throw new IllegalStateException("Missing required properties:".concat(""));
        }
        int iIntValue = ((Integer) this.f362b).intValue();
        int iIntValue2 = ((Integer) this.f363c).intValue();
        int iIntValue3 = ((Integer) this.f364d).intValue();
        int iIntValue4 = ((Integer) this.f365e).intValue();
        int iIntValue5 = ((Integer) this.f366f).intValue();
        n nVar = new n(iIntValue, iIntValue2, iIntValue3, iIntValue4, iIntValue5);
        String strX = iIntValue == -1 ? " audioSource" : "";
        if (iIntValue2 <= 0) {
            strX = strX.concat(" captureSampleRate");
        }
        if (iIntValue3 <= 0) {
            strX = om1.x(strX, " encodeSampleRate");
        }
        if (iIntValue4 <= 0) {
            strX = om1.x(strX, " channelCount");
        }
        if (iIntValue5 == -1) {
            strX = om1.x(strX, " audioFormat");
        }
        if (strX.isEmpty()) {
            return nVar;
        }
        throw new IllegalArgumentException("Required settings missing or non-positive:".concat(strX));
    }

    public g0.l b() {
        String strX = ((a1) this.f364d) == null ? " surface" : "";
        if (((List) this.f365e) == null) {
            strX = strX.concat(" sharedSurfaces");
        }
        if (((Integer) this.f362b) == null) {
            strX = om1.x(strX, " mirrorMode");
        }
        if (((Integer) this.f363c) == null) {
            strX = om1.x(strX, " surfaceGroupId");
        }
        if (((i0) this.f366f) == null) {
            strX = om1.x(strX, " dynamicRange");
        }
        if (strX.isEmpty()) {
            return new g0.l((a1) this.f364d, (List) this.f365e, ((Integer) this.f362b).intValue(), ((Integer) this.f363c).intValue(), (i0) this.f366f);
        }
        throw new IllegalStateException("Missing required properties:".concat(strX));
    }

    public x0.a c() {
        String strX = ((Range) this.f365e) == null ? " bitrate" : "";
        if (((Range) this.f366f) == null) {
            strX = om1.x(strX, " sampleRate");
        }
        if (strX.isEmpty()) {
            return new x0.a((Range) this.f365e, ((Integer) this.f362b).intValue(), ((Integer) this.f363c).intValue(), (Range) this.f366f, ((Integer) this.f364d).intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(strX));
    }

    @Override // n5.e
    public int d(long j10) {
        long[] jArr = (long[]) this.f363c;
        int iB = z.b(jArr, j10, false);
        if (iB < jArr.length) {
            return iB;
        }
        return -1;
    }

    public void e() {
        l2 l2Var;
        b4.e();
        x1 x1Var = (x1) this.f364d;
        x1Var.getClass();
        b4.e();
        f0.a aVar = (f0.a) x1Var.f33321f;
        Objects.requireNonNull(aVar);
        final e2 e2Var = (e2) x1Var.f33318c;
        Objects.requireNonNull(e2Var);
        final e2 e2Var2 = (e2) x1Var.f33319d;
        l2 l2Var2 = aVar.f16477c;
        Objects.requireNonNull(l2Var2);
        l2Var2.a();
        l2 l2Var3 = aVar.f16477c;
        Objects.requireNonNull(l2Var3);
        final int i = 0;
        k0.j.f(l2Var3.f19513e).a(new Runnable() { // from class: f0.j
            @Override // java.lang.Runnable
            public final void run() {
                switch (i) {
                    case 0:
                        e2Var.a();
                        break;
                    case 1:
                        e2 e2Var3 = e2Var;
                        if (e2Var3 != null) {
                            e2Var3.a();
                        }
                        break;
                    default:
                        e2 e2Var4 = e2Var;
                        if (e2Var4 != null) {
                            e2Var4.a();
                        }
                        break;
                }
            }
        }, hl.d.s());
        l2 l2Var4 = aVar.f16479e;
        if (l2Var4 != null) {
            l2Var4.a();
            final int i10 = 1;
            final e2 e2Var3 = null;
            k0.j.f(aVar.f16479e.f19513e).a(new Runnable() { // from class: f0.j
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            e2Var3.a();
                            break;
                        case 1:
                            e2 e2Var32 = e2Var3;
                            if (e2Var32 != null) {
                                e2Var32.a();
                            }
                            break;
                        default:
                            e2 e2Var4 = e2Var3;
                            if (e2Var4 != null) {
                                e2Var4.a();
                            }
                            break;
                    }
                }
            }, hl.d.s());
        }
        if (aVar.f16482h.size() > 1 && (l2Var = aVar.f16478d) != null) {
            l2Var.a();
            final int i11 = 2;
            k0.j.f(aVar.f16478d.f19513e).a(new Runnable() { // from class: f0.j
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
                        case 0:
                            e2Var2.a();
                            break;
                        case 1:
                            e2 e2Var32 = e2Var2;
                            if (e2Var32 != null) {
                                e2Var32.a();
                            }
                            break;
                        default:
                            e2 e2Var4 = e2Var2;
                            if (e2Var4 != null) {
                                e2Var4.a();
                            }
                            break;
                    }
                }
            }, hl.d.s());
        }
        ((f0.n) this.f365e).getClass();
    }

    @Override // n5.e
    public long f(int i) {
        return ((long[]) this.f363c)[i];
    }

    public void g(f0 f0Var, f0 f0Var2, q0.m mVar, q0.m mVar2, Map.Entry entry) {
        q0.m mVar3 = (q0.m) entry.getValue();
        com.google.android.gms.internal.auth.g.e("DualSurfaceProcessorNode", "     -> outputEdge = " + mVar3);
        a0.j jVar = new a0.j(mVar.f31600g.f19677a, ((r0.a) entry.getKey()).f32137a.f32387d, mVar.f31596c ? f0Var : null, ((r0.a) entry.getKey()).f32137a.f32389f, ((r0.a) entry.getKey()).f32137a.f32390g);
        a0.j jVar2 = new a0.j(mVar2.f31600g.f19677a, ((r0.a) entry.getKey()).f32138b.f32387d, mVar2.f31596c ? f0Var2 : null, ((r0.a) entry.getKey()).f32138b.f32389f, ((r0.a) entry.getKey()).f32138b.f32390g);
        int i = ((r0.a) entry.getKey()).f32137a.f32386c;
        mVar3.getClass();
        b4.e();
        mVar3.b();
        f2.g.h("Consumer can only be linked once.", !mVar3.f31602j);
        mVar3.f31602j = true;
        q0.l lVar = mVar3.f31604l;
        k0.j.a(k0.j.j(lVar.c(), new q0.k(mVar3, lVar, i, jVar, jVar2), hl.d.s()), new l6.i(29, this, mVar3, false), hl.d.s());
    }

    @Override // n5.e
    public List h(long j10) {
        t5.c cVar = (t5.c) this.f362b;
        Map map = (Map) this.f364d;
        HashMap map2 = (HashMap) this.f365e;
        HashMap map3 = (HashMap) this.f366f;
        ArrayList<Pair> arrayList = new ArrayList();
        cVar.g(j10, cVar.f33486h, arrayList);
        TreeMap treeMap = new TreeMap();
        cVar.i(j10, false, cVar.f33486h, treeMap);
        cVar.h(j10, map, map2, cVar.f33486h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair pair : arrayList) {
            String str = (String) map3.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                t5.e eVar = (t5.e) map2.get(pair.first);
                eVar.getClass();
                arrayList2.add(new l3.b(null, null, null, bitmapDecodeByteArray, eVar.f33501c, 0, eVar.f33503e, eVar.f33500b, 0, VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR, -3.4028235E38f, eVar.f33504f, eVar.f33505g, false, -16777216, eVar.f33507j, 0.0f, 0));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            t5.e eVar2 = (t5.e) map2.get(entry.getKey());
            eVar2.getClass();
            l3.a aVar = (l3.a) entry.getValue();
            CharSequence charSequence = aVar.f27749a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (t5.a aVar2 : (t5.a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), t5.a.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(aVar2), spannableStringBuilder.getSpanEnd(aVar2), (CharSequence) "");
            }
            for (int i = 0; i < spannableStringBuilder.length(); i++) {
                if (spannableStringBuilder.charAt(i) == ' ') {
                    int i10 = i + 1;
                    int i11 = i10;
                    while (i11 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i11) == ' ') {
                        i11++;
                    }
                    int i12 = i11 - i10;
                    if (i12 > 0) {
                        spannableStringBuilder.delete(i, i12 + i);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i13 = 0; i13 < spannableStringBuilder.length() - 1; i13++) {
                if (spannableStringBuilder.charAt(i13) == '\n') {
                    int i14 = i13 + 1;
                    if (spannableStringBuilder.charAt(i14) == ' ') {
                        spannableStringBuilder.delete(i14, i13 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i15 = 0; i15 < spannableStringBuilder.length() - 1; i15++) {
                if (spannableStringBuilder.charAt(i15) == ' ') {
                    int i16 = i15 + 1;
                    if (spannableStringBuilder.charAt(i16) == '\n') {
                        spannableStringBuilder.delete(i15, i16);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            float f10 = eVar2.f33501c;
            int i17 = eVar2.f33502d;
            aVar.f27753e = f10;
            aVar.f27754f = i17;
            aVar.f27755g = eVar2.f33503e;
            aVar.f27756h = eVar2.f33500b;
            aVar.f27759l = eVar2.f33504f;
            float f11 = eVar2.i;
            int i18 = eVar2.f33506h;
            aVar.f27758k = f11;
            aVar.f27757j = i18;
            aVar.f27763p = eVar2.f33507j;
            arrayList2.add(aVar.a());
        }
        return arrayList2;
    }

    @Override // com.google.android.gms.internal.ads.k81
    /* JADX INFO: renamed from: i */
    public void mo6i(Object obj) {
        mw mwVar = (mw) this.f364d;
        xr0 xr0Var = (xr0) this.f365e;
        ed.d dVar = (ed.d) this.f362b;
        aa.l lVar = (aa.l) this.f366f;
        AtomicBoolean atomicBoolean = lVar.D;
        aa.t tVar = (aa.t) obj;
        as0 as0VarU4 = aa.l.u4(dVar, (tw) this.f363c);
        atomicBoolean.set(true);
        if (!((Boolean) q9.s.f31967e.f31970c.a(al.f3256w8)).booleanValue()) {
            if (mwVar != null) {
                try {
                    mwVar.w("QueryInfo generation has been disabled.");
                } catch (RemoteException e3) {
                    u9.i.e("QueryInfo generation has been disabled.".concat(e3.toString()));
                }
            }
            if (!((Boolean) vl.f11416e.r()).booleanValue() || as0VarU4 == null) {
                return;
            }
            xr0Var.f("QueryInfo generation has been disabled.");
            xr0Var.a(false);
            as0VarU4.a(xr0Var);
            as0VarU4.h();
            return;
        }
        try {
            try {
                if (tVar == null) {
                    if (mwVar != null) {
                        mwVar.l1(null, null, null);
                    }
                    xr0Var.a(true);
                    if (!((Boolean) vl.f11416e.r()).booleanValue() || as0VarU4 == null) {
                        return;
                    }
                    as0VarU4.a(xr0Var);
                    as0VarU4.h();
                    return;
                }
                try {
                    String str = tVar.f701a;
                    if (TextUtils.isEmpty((!TextUtils.isEmpty(tVar.f703c) ? new JSONObject(tVar.f703c) : new JSONObject(tVar.f702b)).optString(CommonUrlParts.REQUEST_ID, ""))) {
                        u9.i.h("The request ID is empty in request JSON.");
                        if (mwVar != null) {
                            mwVar.w("Internal error: request ID is empty in request JSON.");
                        }
                        xr0Var.f("Request ID empty");
                        xr0Var.a(false);
                        if (!((Boolean) vl.f11416e.r()).booleanValue() || as0VarU4 == null) {
                            return;
                        }
                        as0VarU4.a(xr0Var);
                        as0VarU4.h();
                        return;
                    }
                    Bundle bundle = tVar.f706f;
                    boolean z5 = lVar.f636r;
                    String str2 = lVar.f637s;
                    String str3 = lVar.f638t;
                    if (z5 && bundle != null && bundle.getInt(str3, -1) == -1) {
                        bundle.putInt(str3, lVar.f639u.get());
                    }
                    if (lVar.f635q && bundle != null && TextUtils.isEmpty(bundle.getString(str2))) {
                        if (TextUtils.isEmpty(lVar.f641w)) {
                            lVar.f641w = p9.k.C.f31297c.F(lVar.f623d, lVar.f640v.f34365b);
                        }
                        bundle.putString(str2, lVar.f641w);
                    }
                    if (mwVar != null) {
                        if (TextUtils.isEmpty(tVar.f703c)) {
                            mwVar.l1(str, tVar.f702b, bundle);
                        } else {
                            mwVar.l1(str, tVar.f703c, bundle);
                        }
                    }
                    xr0Var.a(true);
                    if (!((Boolean) vl.f11416e.r()).booleanValue() || as0VarU4 == null) {
                        return;
                    }
                    as0VarU4.a(xr0Var);
                    as0VarU4.h();
                } catch (JSONException e7) {
                    u9.i.h("Failed to create JSON object from the request string.");
                    if (mwVar != null) {
                        String string = e7.toString();
                        StringBuilder sb2 = new StringBuilder(string.length() + 33);
                        sb2.append("Internal error for request JSON: ");
                        sb2.append(string);
                        mwVar.w(sb2.toString());
                    }
                    xr0Var.g(e7);
                    xr0Var.a(false);
                    p9.k.C.f31302h.d("SignalGeneratorImpl.generateSignals.onSuccess", e7);
                    if (!((Boolean) vl.f11416e.r()).booleanValue() || as0VarU4 == null) {
                        return;
                    }
                    as0VarU4.a(xr0Var);
                    as0VarU4.h();
                }
            } catch (RemoteException e10) {
                xr0Var.g(e10);
                xr0Var.a(false);
                u9.i.f("", e10);
                p9.k.C.f31302h.d("SignalGeneratorImpl.generateSignals.onSuccess", e10);
                if (!((Boolean) vl.f11416e.r()).booleanValue() || as0VarU4 == null) {
                    return;
                }
                as0VarU4.a(xr0Var);
                as0VarU4.h();
            }
        } catch (Throwable th2) {
            if (((Boolean) vl.f11416e.r()).booleanValue() && as0VarU4 != null) {
                as0VarU4.a(xr0Var);
                as0VarU4.h();
            }
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.k81
    public void k(Throwable th2) {
        String message = th2.getMessage();
        if (((Boolean) q9.s.f31967e.f31970c.a(al.C8)).booleanValue()) {
            p9.k.C.f31302h.e("SignalGeneratorImpl.generateSignals", th2);
        } else {
            p9.k.C.f31302h.d("SignalGeneratorImpl.generateSignals", th2);
        }
        as0 as0VarU4 = aa.l.u4((ed.d) this.f362b, (tw) this.f363c);
        if (((Boolean) vl.f11416e.r()).booleanValue() && as0VarU4 != null) {
            xr0 xr0Var = (xr0) this.f365e;
            xr0Var.g(th2);
            xr0Var.a(false);
            as0VarU4.a(xr0Var);
            as0VarU4.h();
        }
        mw mwVar = (mw) this.f364d;
        if (mwVar == null) {
            return;
        }
        try {
            if (!"Unknown format is no longer supported.".equals(message)) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 16);
                sb2.append("Internal error. ");
                sb2.append(message);
                message = sb2.toString();
            }
            mwVar.w(message);
        } catch (RemoteException e3) {
            u9.i.f("", e3);
        }
    }

    @Override // n5.e
    public int l() {
        return ((long[]) this.f363c).length;
    }

    public ii.m m() {
        if (((fj.g) this.f364d) == null) {
            this.f364d = new fj.g(this);
        }
        fj.g gVar = (fj.g) this.f364d;
        Intrinsics.b(gVar);
        return gVar;
    }

    public File o() {
        Context context = (Activity) this.f363c;
        if (context == null) {
            context = (Context) this.f362b;
        }
        return new File(context.getCacheDir(), "share_plus");
    }

    public void q(Runnable runnable) {
        Context context = (Context) this.f365e;
        if (context instanceof Activity) {
            ((Activity) context).runOnUiThread(runnable);
        } else {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    public void r(v8.a aVar) {
        wf.b bVar = new wf.b(29);
        y8.q qVar = (y8.q) this.f366f;
        y8.j jVar = (y8.j) this.f362b;
        String str = (String) this.f363c;
        v8.e eVar = (v8.e) this.f365e;
        v8.c cVar = (v8.c) this.f364d;
        d9.c cVar2 = qVar.f36571c;
        x7.b bVarA = y8.j.a();
        bVarA.d(jVar.f36552a);
        bVarA.f35979d = v8.d.f34806b;
        bVarA.f35978c = jVar.f36553b;
        y8.j jVarA = bVarA.a();
        q9.o oVar = new q9.o();
        oVar.f31951f = new HashMap();
        oVar.f31949d = Long.valueOf(qVar.f36569a.b());
        oVar.f31950e = Long.valueOf(qVar.f36570b.b());
        oVar.f31946a = str;
        oVar.f31948c = new y8.m(cVar, (byte[]) eVar.apply(aVar.f34802a));
        oVar.f31947b = null;
        d9.a aVar2 = (d9.a) cVar2;
        aVar2.f15720b.execute(new c(aVar2, jVarA, bVar, oVar.i()));
    }

    public void s(String key, Object obj) {
        Intrinsics.checkNotNullParameter(key, "key");
        ((LinkedHashMap) this.f362b).put(key, obj);
        kk.p pVar = (kk.p) ((LinkedHashMap) this.f364d).get(key);
        if (pVar != null) {
            ((kk.t) pVar).G(obj);
        }
        kk.p pVar2 = (kk.p) ((LinkedHashMap) this.f365e).get(key);
        if (pVar2 != null) {
            ((kk.t) pVar2).G(obj);
        }
    }

    public void t(Map arguments) throws IOException {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList<? extends Parcelable> arrayList3;
        String str;
        String strX;
        hi.g gVar;
        boolean zN;
        Context context = (Context) this.f362b;
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        File fileO = o();
        File[] fileArrListFiles = fileO.listFiles();
        if (fileO.exists() && fileArrListFiles != null && fileArrListFiles.length != 0) {
            for (File file : fileArrListFiles) {
                file.delete();
            }
            fileO.delete();
        }
        String str2 = (String) arguments.get("text");
        String str3 = (String) arguments.get("uri");
        String str4 = (String) arguments.get("subject");
        String str5 = (String) arguments.get("title");
        List list = (List) arguments.get("paths");
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof String) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        List list2 = (List) arguments.get("mimeTypes");
        if (list2 != null) {
            arrayList2 = new ArrayList();
            for (Object obj2 : list2) {
                if (obj2 instanceof String) {
                    arrayList2.add(obj2);
                }
            }
        } else {
            arrayList2 = null;
        }
        if (arrayList != null) {
            arrayList3 = new ArrayList<>(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                File file2 = new File((String) it.next());
                try {
                    String canonicalPath = file2.getCanonicalPath();
                    Intrinsics.b(canonicalPath);
                    String canonicalPath2 = o().getCanonicalPath();
                    Intrinsics.checkNotNullExpressionValue(canonicalPath2, "getCanonicalPath(...)");
                    zN = a0.n(canonicalPath, canonicalPath2, false);
                } catch (IOException unused) {
                    zN = false;
                }
                if (zN) {
                    throw new IOException(pe.a.f("Shared file can not be located in '", o().getCanonicalPath(), "'"));
                }
                File fileO2 = o();
                if (!fileO2.exists()) {
                    fileO2.mkdirs();
                }
                File file3 = new File(fileO2, file2.getName());
                tj.m.e(file2, file3, 4);
                Context context2 = (Activity) this.f363c;
                if (context2 == null) {
                    context2 = context;
                }
                arrayList3.add(u1.c.getUriForFile(context2, (String) ((ij.p) this.f365e).getValue(), file3));
            }
        } else {
            arrayList3 = null;
        }
        Intent intent = new Intent();
        if (arrayList3 == null) {
            intent.setAction("android.intent.action.SEND");
            intent.setType("text/plain");
            if (str3 != null) {
                str2 = str3;
            }
            intent.putExtra("android.intent.extra.TEXT", str2);
            if (!(str4 == null || StringsKt.D(str4))) {
                intent.putExtra("android.intent.extra.SUBJECT", str4);
            }
            if (!(str5 == null || StringsKt.D(str5))) {
                intent.putExtra("android.intent.extra.TITLE", str5);
            }
        } else {
            if (arrayList3.isEmpty()) {
                throw new IOException("Error sharing files: No files found");
            }
            str = "*/*";
            if (arrayList3.size() == 1) {
                str = arrayList2 == null || arrayList2.isEmpty() ? "*/*" : (String) CollectionsKt.D(arrayList2);
                intent.setAction("android.intent.action.SEND");
                intent.setType(str);
                intent.putExtra("android.intent.extra.STREAM", (Parcelable) CollectionsKt.D(arrayList3));
            } else {
                intent.setAction("android.intent.action.SEND_MULTIPLE");
                if (arrayList2 == null || arrayList2.isEmpty()) {
                    strX = str;
                    intent.setType(strX);
                    intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList3);
                } else {
                    if (arrayList2.size() == 1) {
                        str = (String) CollectionsKt.D(arrayList2);
                    } else {
                        strX = (String) CollectionsKt.D(arrayList2);
                        int iE = kotlin.collections.s.e(arrayList2);
                        if (1 <= iE) {
                            int i = 1;
                            while (true) {
                                if (!Intrinsics.a(strX, arrayList2.get(i))) {
                                    if (!Intrinsics.a(n(strX), n((String) arrayList2.get(i)))) {
                                        break;
                                    } else {
                                        strX = om1.x(n((String) arrayList2.get(i)), "/*");
                                    }
                                }
                                if (i == iE) {
                                    break;
                                } else {
                                    i++;
                                }
                            }
                        }
                        intent.setType(strX);
                        intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList3);
                    }
                    strX = str;
                    intent.setType(strX);
                    intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList3);
                }
            }
            if (!(str2 == null || StringsKt.D(str2))) {
                intent.putExtra("android.intent.extra.TEXT", str2);
            }
            if (!(str4 == null || StringsKt.D(str4))) {
                intent.putExtra("android.intent.extra.SUBJECT", str4);
            }
            if (!(str5 == null || StringsKt.D(str5))) {
                intent.putExtra("android.intent.extra.TITLE", str5);
            }
            intent.addFlags(1);
        }
        Intent intentCreateChooser = Intent.createChooser(intent, str5, PendingIntent.getBroadcast(context, 0, new Intent(context, (Class<?>) SharePlusPendingIntent.class), ((Number) ((ij.p) this.f366f).getValue()).intValue() | 134217728).getIntentSender());
        if (arrayList3 != null) {
            Context context3 = (Activity) this.f363c;
            if (context3 == null) {
                context3 = context;
            }
            List<ResolveInfo> listQueryIntentActivities = context3.getPackageManager().queryIntentActivities(intentCreateChooser, 65536);
            Intrinsics.checkNotNullExpressionValue(listQueryIntentActivities, "queryIntentActivities(...)");
            Iterator<T> it2 = listQueryIntentActivities.iterator();
            while (it2.hasNext()) {
                String str6 = ((ResolveInfo) it2.next()).activityInfo.packageName;
                Iterator<T> it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    Uri uri = (Uri) it3.next();
                    Context context4 = (Activity) this.f363c;
                    if (context4 == null) {
                        context4 = context;
                    }
                    context4.grantUriPermission(str6, uri, 3);
                }
            }
        }
        Intrinsics.b(intentCreateChooser);
        Activity activity = (Activity) this.f363c;
        if (activity != null) {
            activity.startActivityForResult(intentCreateChooser, 22643);
            return;
        }
        intentCreateChooser.addFlags(268435456);
        qh.b bVar = (qh.b) this.f364d;
        if (bVar.f32114c.compareAndSet(false, true) && (gVar = bVar.f32113b) != null) {
            gVar.success("dev.fluttercommunity.plus/share/unavailable");
            bVar.f32113b = null;
        }
        context.startActivity(intentCreateChooser);
    }

    public m(Map initialState) {
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        this.f362b = j0.m(initialState);
        this.f363c = new LinkedHashMap();
        this.f364d = new LinkedHashMap();
        this.f365e = new LinkedHashMap();
        this.f366f = new d.f(1, this);
    }

    public m(t5.c cVar, HashMap map, HashMap map2, HashMap map3) {
        this.f362b = cVar;
        this.f365e = map2;
        this.f366f = map3;
        this.f364d = Collections.unmodifiableMap(map);
        TreeSet treeSet = new TreeSet();
        int i = 0;
        cVar.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        this.f363c = jArr;
    }
}
