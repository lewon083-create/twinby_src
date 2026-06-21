package ae;

import a0.u;
import t.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f910h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f913c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f914d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f915e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f916f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f917g;

    static {
        byte b2 = (byte) (((byte) (0 | 2)) | 1);
        if (b2 == 3) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        if ((b2 & 1) == 0) {
            sb2.append(" expiresInSecs");
        }
        if ((b2 & 2) == 0) {
            sb2.append(" tokenCreationEpochInSecs");
        }
        throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
    }

    public b(String str, int i, String str2, String str3, long j10, long j11, String str4) {
        this.f911a = str;
        this.f912b = i;
        this.f913c = str2;
        this.f914d = str3;
        this.f915e = j10;
        this.f916f = j11;
        this.f917g = str4;
    }

    public final a a() {
        a aVar = new a();
        aVar.f902a = this.f911a;
        aVar.f903b = this.f912b;
        aVar.f904c = this.f913c;
        aVar.f905d = this.f914d;
        aVar.f906e = this.f915e;
        aVar.f907f = this.f916f;
        aVar.f908g = this.f917g;
        aVar.f909h = (byte) 3;
        return aVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        String str = bVar.f917g;
        String str2 = bVar.f914d;
        String str3 = bVar.f913c;
        String str4 = bVar.f911a;
        String str5 = this.f911a;
        if (str5 == null) {
            if (str4 != null) {
                return false;
            }
        } else if (!str5.equals(str4)) {
            return false;
        }
        if (!z.a(this.f912b, bVar.f912b)) {
            return false;
        }
        String str6 = this.f913c;
        if (str6 == null) {
            if (str3 != null) {
                return false;
            }
        } else if (!str6.equals(str3)) {
            return false;
        }
        String str7 = this.f914d;
        if (str7 == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str7.equals(str2)) {
            return false;
        }
        if (this.f915e != bVar.f915e || this.f916f != bVar.f916f) {
            return false;
        }
        String str8 = this.f917g;
        return str8 == null ? str == null : str8.equals(str);
    }

    public final int hashCode() {
        String str = this.f911a;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ z.m(this.f912b)) * 1000003;
        String str2 = this.f913c;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f914d;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j10 = this.f915e;
        int i = (iHashCode3 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f916f;
        int i10 = (i ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        String str4 = this.f917g;
        return (str4 != null ? str4.hashCode() : 0) ^ i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb2.append(this.f911a);
        sb2.append(", registrationStatus=");
        int i = this.f912b;
        sb2.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "REGISTER_ERROR" : "REGISTERED" : "UNREGISTERED" : "NOT_GENERATED" : "ATTEMPT_MIGRATION");
        sb2.append(", authToken=");
        sb2.append(this.f913c);
        sb2.append(", refreshToken=");
        sb2.append(this.f914d);
        sb2.append(", expiresInSecs=");
        sb2.append(this.f915e);
        sb2.append(", tokenCreationEpochInSecs=");
        sb2.append(this.f916f);
        sb2.append(", fisError=");
        return u.o(sb2, this.f917g, "}");
    }
}
