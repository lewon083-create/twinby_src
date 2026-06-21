package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ro implements c31 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f10004b;

    public /* synthetic */ ro(String str, int i) {
        this.f10003a = i;
        this.f10004b = str;
    }

    @Override // com.google.android.gms.internal.ads.c31
    public final Object apply(Object obj) {
        int i = this.f10003a;
        String strReplace = this.f10004b;
        switch (i) {
            case 0:
                String str = (String) obj;
                po poVar = uo.f11011a;
                if (str == null) {
                    return strReplace;
                }
                if (((Boolean) am.f3319f.r()).booleanValue()) {
                    String[] strArr = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
                    String host = Uri.parse(strReplace).getHost();
                    for (int i10 = 0; i10 < 3; i10++) {
                        if (!host.endsWith(strArr[i10])) {
                        }
                    }
                    return strReplace;
                }
                String str2 = (String) am.f3314a.r();
                String str3 = (String) am.f3315b.r();
                if (!TextUtils.isEmpty(str2)) {
                    strReplace = strReplace.replace(str2, str);
                }
                if (TextUtils.isEmpty(str3)) {
                    return strReplace;
                }
                Uri uri = Uri.parse(strReplace);
                return TextUtils.isEmpty(uri.getQueryParameter(str3)) ? uri.buildUpon().appendQueryParameter(str3, str).toString() : strReplace;
            case 1:
                Throwable th2 = (Throwable) obj;
                po poVar2 = uo.f11011a;
                if (((Boolean) am.i.r()).booleanValue()) {
                    p9.k.C.f31302h.d("prepareClickUrl.attestation2", th2);
                }
                return strReplace;
            case 2:
                return new sb0(strReplace, (um) obj);
            default:
                Throwable th3 = (Throwable) obj;
                pm0 pm0Var = jn0.f6889k;
                u9.i.e("Error calling adapter: ".concat(String.valueOf(strReplace)));
                if (((Boolean) q9.s.f31967e.f31970c.a(al.f3129ne)).booleanValue()) {
                    p9.k.C.f31302h.e("rtbSignal.fetchRtbJsonInfo-".concat(String.valueOf(strReplace)), th3);
                    return null;
                }
                p9.k.C.f31302h.d("rtbSignal.fetchRtbJsonInfo-".concat(String.valueOf(strReplace)), th3);
                return null;
        }
    }
}
