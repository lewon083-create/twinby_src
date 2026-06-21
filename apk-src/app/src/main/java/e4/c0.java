package e4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c0 f16057c = new c0(0, -9223372036854775807L);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f16058d = Pattern.compile("npt[:=]([.\\d]+|now)\\s?-\\s?([.\\d]+)?");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f16059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f16060b;

    public c0(long j10, long j11) {
        this.f16059a = j10;
        this.f16060b = j11;
    }

    public static c0 a(String str) {
        long j10;
        Matcher matcher = f16058d.matcher(str);
        boolean zMatches = matcher.matches();
        Pattern pattern = a0.f16036a;
        if (!zMatches) {
            throw j3.d0.b(str, null);
        }
        String strGroup = matcher.group(1);
        if (strGroup == null) {
            throw j3.d0.b(str, null);
        }
        String str2 = m3.z.f28608a;
        long j11 = strGroup.equals("now") ? 0L : (long) (Float.parseFloat(strGroup) * 1000.0f);
        String strGroup2 = matcher.group(2);
        if (strGroup2 != null) {
            try {
                j10 = (long) (Float.parseFloat(strGroup2) * 1000.0f);
                if (j10 < j11) {
                    throw j3.d0.b(str, null);
                }
            } catch (NumberFormatException e3) {
                throw j3.d0.b(strGroup2, e3);
            }
        } else {
            j10 = -9223372036854775807L;
        }
        return new c0(j11, j10);
    }
}
