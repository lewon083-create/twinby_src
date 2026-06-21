package ih;

import com.yandex.varioqub.config.FetchError;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f21302a;

    static {
        int[] iArr = new int[FetchError.values().length];
        f21302a = iArr;
        try {
            iArr[FetchError.REQUEST_THROTTLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f21302a[FetchError.EMPTY_RESULT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f21302a[FetchError.IDENTIFIERS_NULL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f21302a[FetchError.RESPONSE_PARSE_ERROR.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f21302a[FetchError.NETWORK_ERROR.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f21302a[FetchError.INTERNAL_ERROR.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
