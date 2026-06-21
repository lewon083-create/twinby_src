package yads;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class o21 extends gz2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f41453c = Pattern.compile("(.+?)='(.*?)';", 32);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharsetDecoder f41454a = bu.f37146c.newDecoder();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharsetDecoder f41455b = bu.f37145b.newDecoder();

    @Override // yads.gz2
    public final vs1 a(ys1 ys1Var, ByteBuffer byteBuffer) {
        String string;
        String str = null;
        try {
            string = this.f41454a.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                string = this.f41455b.decode(byteBuffer).toString();
                this.f41455b.reset();
                byteBuffer.rewind();
            } catch (CharacterCodingException unused2) {
                this.f41455b.reset();
                byteBuffer.rewind();
                string = null;
            } catch (Throwable th2) {
                this.f41455b.reset();
                byteBuffer.rewind();
                throw th2;
            }
        } finally {
            this.f41454a.reset();
            byteBuffer.rewind();
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        if (string == null) {
            return new vs1(new s21(bArr, null, null));
        }
        Matcher matcher = f41453c.matcher(string);
        String str2 = null;
        for (int iEnd = 0; matcher.find(iEnd); iEnd = matcher.end()) {
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            if (strGroup != null) {
                String strA = ki.a(strGroup);
                strA.getClass();
                if (strA.equals("streamurl")) {
                    str2 = strGroup2;
                } else if (strA.equals("streamtitle")) {
                    str = strGroup2;
                }
            }
        }
        return new vs1(new s21(bArr, str, str2));
    }
}
