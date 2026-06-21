package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TableRow;
import android.widget.TextView;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.Serializable;
import java.io.StringReader;
import java.math.RoundingMode;
import java.security.GeneralSecurityException;
import java.util.Date;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class vv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f11493a;

    public static final void A(StringBuilder sb2, Iterator it, String str) {
        try {
            if (it.hasNext()) {
                Object next = it.next();
                Objects.requireNonNull(next);
                sb2.append(next instanceof CharSequence ? (CharSequence) next : next.toString());
                while (it.hasNext()) {
                    sb2.append((CharSequence) str);
                    Object next2 = it.next();
                    Objects.requireNonNull(next2);
                    sb2.append(next2 instanceof CharSequence ? (CharSequence) next2 : next2.toString());
                }
            }
        } catch (IOException e3) {
            throw new AssertionError(e3);
        }
    }

    public static c91 B(Callable callable, Executor executor) {
        c91 c91Var = new c91(callable);
        executor.execute(c91Var);
        return c91Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static q9.x1 C(int i, String str, q9.x1 x1Var) {
        String str2;
        int i10 = i - 1;
        if (str == null) {
            if (i == 0) {
                throw null;
            }
            str = "No fill.";
            switch (i10) {
                case 1:
                    str = "Invalid request.";
                    break;
                case 2:
                    break;
                case 3:
                    str = "App ID missing.";
                    break;
                case 4:
                    str = "Network error.";
                    break;
                case 5:
                    str = "Invalid request: Invalid ad unit ID.";
                    break;
                case 6:
                    str = "Invalid request: Invalid ad size.";
                    break;
                case 7:
                    str = "A mediation adapter failed to show the ad.";
                    break;
                case 8:
                    str = "The ad is not ready.";
                    break;
                case 9:
                    str = "The ad has already been shown.";
                    break;
                case 10:
                    str = "The ad can not be shown when app is not in foreground.";
                    break;
                case 11:
                default:
                    str = "Internal error.";
                    break;
                case 12:
                    if (((Integer) q9.s.f31967e.f31970c.a(al.f3228u9)).intValue() <= 0) {
                        str = "The mediation adapter did not return an ad.";
                    }
                    break;
                case 13:
                    str = "Mismatch request IDs.";
                    break;
                case 14:
                    str = "Invalid ad string.";
                    break;
                case 15:
                    str = "Ad inspector had an internal error.";
                    break;
                case 16:
                    str = "Ad inspector failed to load.";
                    break;
                case 17:
                    str = "Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.";
                    break;
                case 18:
                    str = "Ad inspector cannot be opened because it is already open.";
                    break;
            }
        }
        String str3 = str;
        if (i == 0) {
            throw null;
        }
        int i11 = 0;
        int i12 = 2;
        switch (i10) {
            case 0:
            case 11:
            case 15:
                i12 = i11;
                return new q9.x1(i12, str3, "com.google.android.gms.ads", x1Var, null);
            case 1:
            case 5:
            case 6:
            case 9:
            case 16:
                i12 = 1;
                return new q9.x1(i12, str3, "com.google.android.gms.ads", x1Var, null);
            case 2:
            case 10:
            case 18:
                i12 = 3;
                return new q9.x1(i12, str3, "com.google.android.gms.ads", x1Var, null);
            case 3:
                i11 = 8;
                i12 = i11;
                return new q9.x1(i12, str3, "com.google.android.gms.ads", x1Var, null);
            case 4:
            case 8:
            case 17:
                return new q9.x1(i12, str3, "com.google.android.gms.ads", x1Var, null);
            case 7:
                i11 = 4;
                i12 = i11;
                return new q9.x1(i12, str3, "com.google.android.gms.ads", x1Var, null);
            case 12:
                if (((Integer) q9.s.f31967e.f31970c.a(al.f3228u9)).intValue() <= 0) {
                    i11 = 9;
                    i12 = i11;
                    return new q9.x1(i12, str3, "com.google.android.gms.ads", x1Var, null);
                }
                i12 = 3;
                return new q9.x1(i12, str3, "com.google.android.gms.ads", x1Var, null);
            case 13:
                i11 = 10;
                i12 = i11;
                return new q9.x1(i12, str3, "com.google.android.gms.ads", x1Var, null);
            case 14:
                i11 = 11;
                i12 = i11;
                return new q9.x1(i12, str3, "com.google.android.gms.ads", x1Var, null);
            default:
                switch (i) {
                    case 1:
                        str2 = "INTERNAL_ERROR";
                        break;
                    case 2:
                        str2 = "INVALID_REQUEST";
                        break;
                    case 3:
                        str2 = "NO_FILL";
                        break;
                    case 4:
                        str2 = "APP_ID_MISSING";
                        break;
                    case 5:
                        str2 = "NETWORK_ERROR";
                        break;
                    case 6:
                        str2 = "INVALID_AD_UNIT_ID";
                        break;
                    case 7:
                        str2 = "INVALID_AD_SIZE";
                        break;
                    case 8:
                        str2 = "MEDIATION_SHOW_ERROR";
                        break;
                    case 9:
                        str2 = "NOT_READY";
                        break;
                    case 10:
                        str2 = "AD_REUSED";
                        break;
                    case 11:
                        str2 = "APP_NOT_FOREGROUND";
                        break;
                    case 12:
                        str2 = "INTERNAL_SHOW_ERROR";
                        break;
                    case 13:
                        str2 = "MEDIATION_NO_FILL";
                        break;
                    case 14:
                        str2 = "REQUEST_ID_MISMATCH";
                        break;
                    case 15:
                        str2 = "INVALID_AD_STRING";
                        break;
                    case 16:
                        str2 = "AD_INSPECTOR_INTERNAL_ERROR";
                        break;
                    case 17:
                        str2 = "AD_INSPECTOR_FAILED_TO_LOAD";
                        break;
                    case 18:
                        str2 = "AD_INSPECTOR_NOT_IN_TEST_MODE";
                        break;
                    default:
                        str2 = "AD_INSPECTOR_ALREADY_OPEN";
                        break;
                }
                throw new AssertionError("Unknown SdkError: ".concat(str2));
        }
    }

    public static TextView D(Context context, String str, int i, int i10, float f10, String str2) {
        TextView textView = new TextView(context);
        textView.setTag(str2);
        F(textView, -2, -2);
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new TableRow.LayoutParams();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(layoutParams);
        marginLayoutParams.bottomMargin = (int) TypedValue.applyDimension(1, f10, textView.getResources().getDisplayMetrics());
        textView.setLayoutParams(marginLayoutParams);
        textView.setTextAppearance(context, i);
        textView.setTextColor(i10);
        textView.setText(str);
        return textView;
    }

    public static c91 E(y71 y71Var, Executor executor) {
        c91 c91Var = new c91();
        c91Var.i = new b91(c91Var, y71Var);
        executor.execute(c91Var);
        return c91Var;
    }

    public static void F(View view, int i, int i10) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new TableRow.LayoutParams();
        }
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(layoutParams);
        layoutParams2.height = i;
        layoutParams2.width = i10;
        view.setLayoutParams(layoutParams2);
    }

    public static y61 G(ed.d dVar, Class cls, c31 c31Var, Executor executor) {
        int i = z61.f12897l;
        y61 y61Var = new y61(dVar, cls, c31Var);
        dVar.a(y61Var, fs1.J(executor, y61Var));
        return y61Var;
    }

    public static x61 H(ed.d dVar, Class cls, z71 z71Var, Executor executor) {
        int i = z61.f12897l;
        x61 x61Var = new x61(dVar, cls, z71Var);
        dVar.a(x61Var, fs1.J(executor, x61Var));
        return x61Var;
    }

    public static ed.d I(ed.d dVar, long j10, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        if (dVar.isDone()) {
            return dVar;
        }
        a91 a91Var = new a91();
        a91Var.i = dVar;
        kr0 kr0Var = new kr0();
        kr0Var.f7290c = a91Var;
        a91Var.f2819j = scheduledExecutorService.schedule(kr0Var, j10, timeUnit);
        dVar.a(kr0Var, f81.f5272b);
        return a91Var;
    }

    public static r71 J(ed.d dVar, z71 z71Var, Executor executor) {
        int i = t71.f10522k;
        r71 r71Var = new r71(dVar, z71Var);
        dVar.a(r71Var, fs1.J(executor, r71Var));
        return r71Var;
    }

    public static s71 K(ed.d dVar, c31 c31Var, Executor executor) {
        int i = t71.f10522k;
        s71 s71Var = new s71(dVar, c31Var);
        dVar.a(s71Var, fs1.J(executor, s71Var));
        return s71Var;
    }

    public static Object L(Future future) {
        if (future.isDone()) {
            return ix.d(future);
        }
        throw new IllegalStateException(gr.P("Future was expected to be done: %s", future));
    }

    public static Object M(jx jxVar) {
        try {
            return ix.d(jxVar);
        } catch (ExecutionException e3) {
            if (e3.getCause() instanceof Error) {
                throw new g81((Error) e3.getCause());
            }
            throw new oc(e3.getCause());
        }
    }

    public static int a(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * (-862048943)), 15)) * 461845907);
    }

    public static xv0 b(Context context, ng ngVar, String str, String str2, dv0 dv0Var) {
        xv0 xv0Var;
        gv0 gv0Var = new gv0(context, ngVar, str, str2, dv0Var);
        try {
            xv0Var = (xv0) gv0Var.f5912f.poll(50000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e3) {
            gv0Var.b(2009, gv0Var.i, e3);
            xv0Var = null;
        }
        gv0Var.b(3004, gv0Var.i, null);
        if (xv0Var != null) {
            if (xv0Var.f12347d == 7) {
                dv0.f4679e = 3;
            } else {
                dv0.f4679e = 2;
            }
        }
        return xv0Var == null ? new xv0() : xv0Var;
    }

    public static o31 c(o31 o31Var) {
        return ((o31Var instanceof q31) || (o31Var instanceof p31)) ? o31Var : o31Var instanceof Serializable ? new p31(o31Var) : new q31(o31Var);
    }

    public static n81 d(Object obj) {
        return obj == null ? n81.f8237c : new n81(obj);
    }

    public static l91 e(String str) throws GeneralSecurityException {
        String str2;
        try {
            try {
                byte[] bArrB = new f91(new ByteArrayInputStream(str.getBytes(f91.f5277b))).a().b();
                try {
                    kn1 kn1Var = kn1.f7271a;
                    int i = tm1.f10663a;
                    rh1 rh1VarD = rh1.D(bArrB, kn1.f7272b);
                    for (qh1 qh1Var : rh1VarD.A()) {
                        if (qh1Var.A().B() == 1 || qh1Var.A().B() == 2 || qh1Var.A().B() == 3) {
                            switch (qh1Var.A().B()) {
                                case 1:
                                    str2 = "UNKNOWN_KEYMATERIAL";
                                    break;
                                case 2:
                                    str2 = "SYMMETRIC";
                                    break;
                                case 3:
                                    str2 = "ASYMMETRIC_PRIVATE";
                                    break;
                                case 4:
                                    str2 = "ASYMMETRIC_PUBLIC";
                                    break;
                                case 5:
                                    str2 = "REMOTE";
                                    break;
                                case 6:
                                    str2 = "UNRECOGNIZED";
                                    break;
                                default:
                                    throw null;
                            }
                            throw new GeneralSecurityException("keyset contains key material of type " + str2 + " for type url " + qh1Var.A().z());
                        }
                    }
                    return l91.a(rh1VarD);
                } catch (co1 unused) {
                    throw new GeneralSecurityException("invalid keyset");
                }
            } catch (co1 unused2) {
                throw new GeneralSecurityException("invalid keyset");
            }
        } catch (IOException unused3) {
            throw new GeneralSecurityException("Parse keyset failed");
        }
    }

    public static mc1 f() {
        try {
            mc1 mc1Var = u91.f10899a;
            if (gc1.a()) {
                throw new GeneralSecurityException("Cannot use non-FIPS-compliant AeadConfigurationV1 in FIPS mode");
            }
            return u91.f10899a;
        } catch (GeneralSecurityException e3) {
            throw new IllegalStateException(e3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c5 A[EDGE_INSN: B:66:0x00c5->B:44:0x00c5 BREAK  A[LOOP:1: B:29:0x0094->B:67:0x0094]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String g(android.content.Context r10) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.vv.g(android.content.Context):java.lang.String");
    }

    public static Date h(long j10) {
        return new Date((j10 - 2082844800) * 1000);
    }

    public static q9.x1 i(Throwable th2) {
        if (th2 instanceof di0) {
            di0 di0Var = (di0) th2;
            return z(di0Var.f10939b, di0Var.f4575c);
        }
        if (th2 instanceof uf0) {
            return th2.getMessage() == null ? C(((uf0) th2).f10939b, null, null) : C(((uf0) th2).f10939b, th2.getMessage(), null);
        }
        if (!(th2 instanceof t9.n)) {
            return C(1, null, null);
        }
        t9.n nVar = (t9.n) th2;
        int i = nVar.f33634b;
        String message = nVar.getMessage();
        if (message == null) {
            message = "";
        }
        return new q9.x1(i, message, "com.google.android.gms.ads", null, null);
    }

    public static void j(int i, Object[] objArr) {
        for (int i10 = 0; i10 < i; i10++) {
            w(i10, objArr[i10]);
        }
    }

    public static void k(SpannableStringBuilder spannableStringBuilder, Object obj, int i, int i10) {
        for (Object obj2 : spannableStringBuilder.getSpans(i, i10, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i && spannableStringBuilder.getSpanEnd(obj2) == i10 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i, i10, 33);
    }

    public static void l(String str) {
        if (((Boolean) jm.f6882a.r()).booleanValue()) {
            u9.i.c(str);
        }
    }

    public static void m(String str, Exception exc) {
        Log.e("OMIDLIB", str, exc);
    }

    public static void n(AtomicReference atomicReference, wo0 wo0Var) {
        Object obj = atomicReference.get();
        if (obj == null) {
            return;
        }
        try {
            wo0Var.a(obj);
        } catch (RemoteException e3) {
            u9.i.k("#007 Could not call remote method.", e3);
        } catch (NullPointerException e7) {
            u9.i.i("NullPointerException occurs when invoking a method from a delegating listener.", e7);
        }
    }

    public static boolean p(String str) {
        int length = str.length();
        int i = 0;
        while (i != length) {
            char cCharAt = str.charAt(i);
            int i10 = i + 1;
            if (!Character.isSurrogate(cCharAt)) {
                i = i10;
            } else {
                if (Character.isLowSurrogate(cCharAt) || i10 == length || !Character.isLowSurrogate(str.charAt(i10))) {
                    return false;
                }
                i += 2;
            }
        }
        return true;
    }

    public static byte[] q(String str) {
        if ((str.length() & 1) != 0) {
            throw new IllegalArgumentException("Expected a string of even length");
        }
        int length = str.length() >> 1;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i10 = i + i;
            int iDigit = Character.digit(str.charAt(i10), 16);
            int iDigit2 = Character.digit(str.charAt(i10 + 1), 16);
            if (iDigit == -1 || iDigit2 == -1) {
                throw new IllegalArgumentException("input is not hexadecimal");
            }
            bArr[i] = (byte) ((iDigit * 16) + iDigit2);
        }
        return bArr;
    }

    public static long[] r(long[]... jArr) {
        long length = 0;
        for (long[] jArr2 : jArr) {
            length += (long) jArr2.length;
        }
        int i = (int) length;
        ix.Z("the total number of elements (%s) in the arrays must fit in an int", length, length == ((long) i));
        long[] jArr3 = new long[i];
        int i10 = 0;
        for (long[] jArr4 : jArr) {
            int length2 = jArr4.length;
            System.arraycopy(jArr4, 0, jArr3, i10, length2);
            i10 += length2;
        }
        return jArr3;
    }

    public static int s(int i, int i10) {
        RoundingMode roundingMode = RoundingMode.CEILING;
        roundingMode.getClass();
        if (i10 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i11 = i / i10;
        int i12 = i - (i10 * i11);
        if (i12 == 0) {
            return i11;
        }
        int i13 = ((i ^ i10) >> 31) | 1;
        switch (r61.f9716a[roundingMode.ordinal()]) {
            case 1:
                ix.B(false);
                return i11;
            case 2:
                return i11;
            case 3:
                if (i13 >= 0) {
                    return i11;
                }
                break;
            case 4:
                break;
            case 5:
                if (i13 <= 0) {
                    return i11;
                }
                break;
            case 6:
            case 7:
            case 8:
                int iAbs = Math.abs(i12);
                int iAbs2 = iAbs - (Math.abs(i10) - iAbs);
                if (iAbs2 == 0) {
                    RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                    RoundingMode roundingMode3 = RoundingMode.HALF_EVEN;
                    return i11;
                }
                if (iAbs2 <= 0) {
                    return i11;
                }
                break;
            default:
                throw new AssertionError();
        }
        return i11 + i13;
    }

    public static int t(Object obj) {
        return a(obj == null ? 0 : obj.hashCode());
    }

    public static wl1 u(String str) throws IOException {
        try {
            return nc1.N(new mm1(new StringReader(str)));
        } catch (NumberFormatException e3) {
            throw new IOException(e3);
        }
    }

    public static q9.x1 v(Throwable th2, ei0 ei0Var) {
        q9.x1 x1Var;
        q9.x1 x1VarI = i(th2);
        int i = x1VarI.f31976b;
        if ((i == 3 || i == 0) && (x1Var = x1VarI.f31979e) != null && !x1Var.f31978d.equals("com.google.android.gms.ads")) {
            x1VarI.f31979e = null;
        }
        if (ei0Var != null) {
            x1VarI.f31980f = new e60(ei0Var.f4966e, "", ei0Var, ei0Var.f4965d, ei0Var.f4964c);
        }
        return x1VarI;
    }

    public static void w(int i, Object obj) {
        if (obj == null) {
            throw new NullPointerException(l7.o.j(i, "at index ", new StringBuilder(String.valueOf(i).length() + 9)));
        }
    }

    public static byte[] x(String str, boolean z5) {
        g61 g61Var;
        if (z5) {
            g61Var = i61.f6400e;
            if (g61Var.f6403b != null) {
                g61Var = new g61(g61Var.f6402a, (Character) null);
            }
        } else {
            g61Var = i61.f6399d;
        }
        byte[] bArrH = g61Var.h(str);
        if (bArrH.length != 0 || str.length() <= 0) {
            return bArrH;
        }
        throw new IllegalArgumentException("Unable to decode ".concat(str));
    }

    public static m81 y(Throwable th2) {
        th2.getClass();
        m81 m81Var = new m81();
        m81Var.f(th2);
        return m81Var;
    }

    public static q9.x1 z(int i, q9.x1 x1Var) {
        if (i == 0) {
            throw null;
        }
        if (i == 8) {
            if (((Integer) q9.s.f31967e.f31970c.a(al.f3182r9)).intValue() > 0) {
                return x1Var;
            }
            i = 8;
        }
        return C(i, null, x1Var);
    }

    public abstract void o(byte[] bArr, int i, int i10);
}
