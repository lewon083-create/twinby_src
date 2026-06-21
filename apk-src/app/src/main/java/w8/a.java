package w8;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import v8.c;
import y8.l;
import ya.e;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f35201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Set f35202d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f35203e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f35204f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f35206b;

    static {
        String strS = e.s("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f35201c = strS;
        String strS2 = e.s("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String strS3 = e.s("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f35202d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new c("proto"), new c("json"))));
        f35203e = new a(strS, null);
        f35204f = new a(strS2, strS3);
    }

    public a(String str, String str2) {
        this.f35205a = str;
        this.f35206b = str2;
    }

    public static a a(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] strArrSplit = str.substring(2).split(Pattern.quote("\\"), 2);
        if (strArrSplit.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = strArrSplit[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new a(str2, str3);
    }
}
