package gd;

import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String[] f20108g = {"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final SimpleDateFormat f20109h = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f20112c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Date f20113d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f20114e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f20115f;

    public b(String str, String str2, String str3, Date date, long j10, long j11) {
        this.f20110a = str;
        this.f20111b = str2;
        this.f20112c = str3;
        this.f20113d = date;
        this.f20114e = j10;
        this.f20115f = j11;
    }

    public final jd.a a() {
        jd.a aVar = new jd.a();
        aVar.f26604a = "frc";
        aVar.f26615m = this.f20113d.getTime();
        aVar.f26605b = this.f20110a;
        aVar.f26606c = this.f20111b;
        String str = this.f20112c;
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        aVar.f26607d = str;
        aVar.f26608e = this.f20114e;
        aVar.f26612j = this.f20115f;
        return aVar;
    }
}
