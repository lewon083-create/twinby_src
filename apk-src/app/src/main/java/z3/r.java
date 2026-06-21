package z3;

import android.util.Base64;
import j3.d0;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import m3.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements m4.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f46188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f46189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f46145d = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f46147e = Pattern.compile("VIDEO=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Pattern f46149f = Pattern.compile("AUDIO=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Pattern f46151g = Pattern.compile("SUBTITLES=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Pattern f46153h = Pattern.compile("CLOSED-CAPTIONS=\"((?:.|\f)+?)\"");
    public static final Pattern i = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Pattern f46155j = Pattern.compile("CHANNELS=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Pattern f46157k = Pattern.compile("VIDEO-RANGE=(SDR|PQ|HLG)");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Pattern f46159l = Pattern.compile("CODECS=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Pattern f46161m = Pattern.compile("SUPPLEMENTAL-CODECS=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Pattern f46163n = Pattern.compile("RESOLUTION=(\\d+x\\d+)");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Pattern f46165o = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Pattern f46166p = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Pattern f46168q = Pattern.compile("DURATION=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Pattern f46170r = Pattern.compile("[:,]DURATION=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Pattern f46172s = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Pattern f46174t = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final Pattern f46176u = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Pattern f46178v = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Pattern f46180w = a("CAN-SKIP-DATERANGES");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Pattern f46182x = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final Pattern f46184y = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final Pattern f46186z = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern A = a("CAN-BLOCK-RELOAD");
    public static final Pattern B = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
    public static final Pattern C = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    public static final Pattern D = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
    public static final Pattern E = Pattern.compile("LAST-MSN=(\\d+)\\b");
    public static final Pattern F = Pattern.compile("LAST-PART=(\\d+)\\b");
    public static final Pattern G = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    public static final Pattern H = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    public static final Pattern I = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    public static final Pattern J = Pattern.compile("BYTERANGE-START=(\\d+)\\b");
    public static final Pattern K = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");
    public static final Pattern L = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
    public static final Pattern M = Pattern.compile("KEYFORMAT=\"((?:.|\f)+?)\"");
    public static final Pattern N = Pattern.compile("KEYFORMATVERSIONS=\"((?:.|\f)+?)\"");
    public static final Pattern O = Pattern.compile("URI=\"((?:.|\f)+?)\"");
    public static final Pattern P = Pattern.compile("IV=([^,.*]+)");
    public static final Pattern Q = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    public static final Pattern R = Pattern.compile("TYPE=(PART|MAP)");
    public static final Pattern S = Pattern.compile("LANGUAGE=\"((?:.|\f)+?)\"");
    public static final Pattern T = Pattern.compile("NAME=\"((?:.|\f)+?)\"");
    public static final Pattern U = Pattern.compile("GROUP-ID=\"((?:.|\f)+?)\"");
    public static final Pattern V = Pattern.compile("CHARACTERISTICS=\"((?:.|\f)+?)\"");
    public static final Pattern W = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    public static final Pattern X = a("AUTOSELECT");
    public static final Pattern Y = a("DEFAULT");
    public static final Pattern Z = a("FORCED");

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final Pattern f46142a0 = a("INDEPENDENT");

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final Pattern f46143b0 = a("GAP");

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final Pattern f46144c0 = a("PRECISE");

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final Pattern f46146d0 = Pattern.compile("VALUE=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final Pattern f46148e0 = Pattern.compile("IMPORT=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final Pattern f46150f0 = Pattern.compile("[:,]ID=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final Pattern f46152g0 = Pattern.compile("CLASS=\"((?:.|\f)+?)\"");
    public static final Pattern h0 = Pattern.compile("START-DATE=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final Pattern f46154i0 = Pattern.compile("CUE=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final Pattern f46156j0 = Pattern.compile("END-DATE=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final Pattern f46158k0 = Pattern.compile("PLANNED-DURATION=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final Pattern f46160l0 = a("END-ON-NEXT");

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final Pattern f46162m0 = Pattern.compile("X-ASSET-URI=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final Pattern f46164n0 = Pattern.compile("X-ASSET-LIST=\"((?:.|\f)+?)\"");
    public static final Pattern o0 = Pattern.compile("X-RESUME-OFFSET=(-?[\\d\\.]+)\\b");

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final Pattern f46167p0 = Pattern.compile("X-PLAYOUT-LIMIT=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final Pattern f46169q0 = Pattern.compile("X-SNAP=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final Pattern f46171r0 = Pattern.compile("X-RESTRICT=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final Pattern f46173s0 = Pattern.compile("X-CONTENT-MAY-VARY=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final Pattern f46175t0 = Pattern.compile("X-TIMELINE-OCCUPIES=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final Pattern f46177u0 = Pattern.compile("X-TIMELINE-STYLE=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final Pattern f46179v0 = Pattern.compile("X-SKIP-CONTROL-OFFSET=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final Pattern f46181w0 = Pattern.compile("X-SKIP-CONTROL-DURATION=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final Pattern f46183x0 = Pattern.compile("X-SKIP-CONTROL-LABEL-ID=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final Pattern f46185y0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final Pattern f46187z0 = Pattern.compile("\\b(X-[A-Z0-9-]+)=");

    public r(o oVar, l lVar) {
        this.f46188b = oVar;
        this.f46189c = lVar;
    }

    public static Pattern a(String str) {
        return Pattern.compile(str.concat("=(NO|YES)"));
    }

    public static j3.l b(String str, j3.k[] kVarArr) {
        j3.k[] kVarArr2 = new j3.k[kVarArr.length];
        for (int i10 = 0; i10 < kVarArr.length; i10++) {
            j3.k kVar = kVarArr[i10];
            kVarArr2[i10] = new j3.k(kVar.f26262c, kVar.f26263d, kVar.f26264e, null);
        }
        return new j3.l(str, true, kVarArr2);
    }

    public static j3.k c(String str, HashMap map, String str2) throws d0 {
        String strI = i(str, N, "1", map);
        boolean zEquals = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2);
        Pattern pattern = O;
        if (zEquals) {
            String strJ = j(str, pattern, map);
            return new j3.k(j3.f.f26234d, null, "video/mp4", Base64.decode(strJ.substring(strJ.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            UUID uuid = j3.f.f26234d;
            String str3 = z.f28608a;
            return new j3.k(uuid, null, "hls", str.getBytes(StandardCharsets.UTF_8));
        }
        if (!"com.microsoft.playready".equals(str2) || !"1".equals(strI)) {
            return null;
        }
        String strJ2 = j(str, pattern, map);
        byte[] bArrDecode = Base64.decode(strJ2.substring(strJ2.indexOf(44)), 0);
        UUID uuid2 = j3.f.f26235e;
        return new j3.k(uuid2, null, "video/mp4", k5.p.a(uuid2, null, bArrDecode));
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x03fe, code lost:
    
        throw new z3.q();
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x07a1, code lost:
    
        r51 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x07a5, code lost:
    
        r51 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x07b3, code lost:
    
        r51 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x07c0, code lost:
    
        r51 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x0967, code lost:
    
        r29 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x096c, code lost:
    
        r29 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x097c, code lost:
    
        r29 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x098c, code lost:
    
        r29 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x099c, code lost:
    
        r29 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x09ac, code lost:
    
        r29 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x09bb, code lost:
    
        r29 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x09c8, code lost:
    
        r29 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x09d5, code lost:
    
        r29 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x09e2, code lost:
    
        r29 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x09ef, code lost:
    
        r29 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x09fd, code lost:
    
        r29 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x0a0a, code lost:
    
        r29 = r11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:274:0x07a3 A[PHI: r51
      0x07a3: PHI (r51v18 int) = (r51v14 int), (r51v15 int), (r51v16 int), (r51v19 int) binds: [B:284:0x07c8, B:280:0x07bb, B:276:0x07ad, B:273:0x07a1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:344:0x08f2  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x090e  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0969 A[PHI: r29
      0x0969: PHI (r29v17 java.util.regex.Matcher) = 
      (r29v4 java.util.regex.Matcher)
      (r29v5 java.util.regex.Matcher)
      (r29v6 java.util.regex.Matcher)
      (r29v7 java.util.regex.Matcher)
      (r29v8 java.util.regex.Matcher)
      (r29v9 java.util.regex.Matcher)
      (r29v10 java.util.regex.Matcher)
      (r29v11 java.util.regex.Matcher)
      (r29v12 java.util.regex.Matcher)
      (r29v13 java.util.regex.Matcher)
      (r29v14 java.util.regex.Matcher)
      (r29v15 java.util.regex.Matcher)
      (r29v18 java.util.regex.Matcher)
     binds: [B:414:0x0a12, B:410:0x0a05, B:406:0x09f7, B:402:0x09ea, B:398:0x09dd, B:394:0x09d0, B:390:0x09c3, B:386:0x09b4, B:382:0x09a4, B:378:0x0994, B:374:0x0984, B:370:0x0974, B:367:0x0967] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:662:0x0f10  */
    /* JADX WARN: Removed duplicated region for block: B:664:0x0f29  */
    /* JADX WARN: Removed duplicated region for block: B:667:0x0f41  */
    /* JADX WARN: Removed duplicated region for block: B:668:0x0f44  */
    /* JADX WARN: Removed duplicated region for block: B:719:0x10a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static z3.l d(z3.o r131, z3.l r132, u7.f r133, java.lang.String r134) throws z3.q, j3.d0 {
        /*
            Method dump skipped, instruction units count: 4450
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z3.r.d(z3.o, z3.l, u7.f, java.lang.String):z3.l");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0233  */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16, types: [int] */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r43v3 */
    /* JADX WARN: Type inference failed for: r43v5 */
    /* JADX WARN: Type inference failed for: r43v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static z3.o e(u7.f r43, java.lang.String r44) throws j3.d0 {
        /*
            Method dump skipped, instruction units count: 1616
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z3.r.e(u7.f, java.lang.String):z3.o");
    }

    public static boolean f(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return "YES".equals(matcher.group(1));
        }
        return false;
    }

    public static double g(String str, Pattern pattern, double d10) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return d10;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        return Double.parseDouble(strGroup);
    }

    public static long h(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return -1L;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        return Long.parseLong(strGroup);
    }

    public static String i(String str, Pattern pattern, String str2, Map map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = matcher.group(1);
            str2.getClass();
        }
        return (map.isEmpty() || str2 == null) ? str2 : k(str2, map);
    }

    public static String j(String str, Pattern pattern, Map map) throws d0 {
        String strI = i(str, pattern, null, map);
        if (strI != null) {
            return strI;
        }
        throw d0.b("Couldn't match " + pattern.pattern() + " in " + str, null);
    }

    public static String k(String str, Map map) {
        Matcher matcher = f46185y0.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            if (map.containsKey(strGroup)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement((String) map.get(strGroup)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003f A[Catch: all -> 0x0096, TryCatch #0 {all -> 0x0096, blocks: (B:3:0x000f, B:5:0x0018, B:7:0x0020, B:10:0x0029, B:32:0x0069, B:34:0x006f, B:37:0x007a, B:39:0x0082, B:44:0x0098, B:46:0x00a0, B:48:0x00a8, B:50:0x00b0, B:52:0x00b8, B:54:0x00c0, B:56:0x00c8, B:58:0x00d0, B:61:0x00d9, B:62:0x00dd, B:67:0x00ff, B:68:0x0105, B:13:0x0030, B:15:0x0036, B:19:0x003f, B:22:0x0048, B:24:0x0051, B:26:0x0057, B:28:0x005d, B:29:0x0062), top: B:71:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x004f A[SYNTHETIC] */
    @Override // m4.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m(android.net.Uri r7, p3.j r8) throws j3.d0 {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z3.r.m(android.net.Uri, p3.j):java.lang.Object");
    }
}
