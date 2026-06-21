package d5;

import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.j4;
import j3.b0;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends b4 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Pattern f15558h = Pattern.compile("(.+?)='(.*?)';", 32);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CharsetDecoder f15559f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CharsetDecoder f15560g;

    public a() {
        super(18);
        this.f15559f = StandardCharsets.UTF_8.newDecoder();
        this.f15560g = StandardCharsets.ISO_8859_1.newDecoder();
    }

    @Override // com.google.android.gms.internal.measurement.b4
    public final b0 m(z4.a aVar, ByteBuffer byteBuffer) {
        String string;
        CharsetDecoder charsetDecoder = this.f15560g;
        CharsetDecoder charsetDecoder2 = this.f15559f;
        String str = null;
        try {
            string = charsetDecoder2.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                String string2 = charsetDecoder.decode(byteBuffer).toString();
                charsetDecoder.reset();
                byteBuffer.rewind();
                string = string2;
            } catch (CharacterCodingException unused2) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                string = null;
            } catch (Throwable th2) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                throw th2;
            }
        } finally {
            charsetDecoder2.reset();
            byteBuffer.rewind();
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        if (string == null) {
            return new b0(new c(bArr, null, null));
        }
        Matcher matcher = f15558h.matcher(string);
        String str2 = null;
        for (int iEnd = 0; matcher.find(iEnd); iEnd = matcher.end()) {
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            if (strGroup != null) {
                String strX = j4.x(strGroup);
                strX.getClass();
                if (strX.equals("streamurl")) {
                    str2 = strGroup2;
                } else if (strX.equals("streamtitle")) {
                    str = strGroup2;
                }
            }
        }
        return new b0(new c(bArr, str, str2));
    }
}
