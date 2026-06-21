package fd;

import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;
import pa.c0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f16774c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f16775d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f16776e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f16777f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f16778g;

    public i(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        c0.k("ApplicationId must be set.", !ua.c.a(str));
        this.f16773b = str;
        this.f16772a = str2;
        this.f16774c = str3;
        this.f16775d = str4;
        this.f16776e = str5;
        this.f16777f = str6;
        this.f16778g = str7;
    }

    public static i a(Context context) {
        l6.i iVar = new l6.i(context, 22);
        String strF = iVar.f("google_app_id");
        if (TextUtils.isEmpty(strF)) {
            return null;
        }
        return new i(strF, iVar.f("google_api_key"), iVar.f("firebase_database_url"), iVar.f("ga_trackingId"), iVar.f("gcm_defaultSenderId"), iVar.f("google_storage_bucket"), iVar.f("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return c0.m(this.f16773b, iVar.f16773b) && c0.m(this.f16772a, iVar.f16772a) && c0.m(this.f16774c, iVar.f16774c) && c0.m(this.f16775d, iVar.f16775d) && c0.m(this.f16776e, iVar.f16776e) && c0.m(this.f16777f, iVar.f16777f) && c0.m(this.f16778g, iVar.f16778g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16773b, this.f16772a, this.f16774c, this.f16775d, this.f16776e, this.f16777f, this.f16778g});
    }

    public final String toString() {
        l6.i iVar = new l6.i(this);
        iVar.b(this.f16773b, "applicationId");
        iVar.b(this.f16772a, "apiKey");
        iVar.b(this.f16774c, "databaseUrl");
        iVar.b(this.f16776e, "gcmSenderId");
        iVar.b(this.f16777f, "storageBucket");
        iVar.b(this.f16778g, "projectId");
        return iVar.toString();
    }
}
