package h6;

import com.google.android.gms.internal.ads.om1;
import java.util.Arrays;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f20434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f20436c;

    public a(String keyIdentifier, byte[] encryptedTopic, byte[] encapsulatedKey) {
        Intrinsics.checkNotNullParameter(encryptedTopic, "encryptedTopic");
        Intrinsics.checkNotNullParameter(keyIdentifier, "keyIdentifier");
        Intrinsics.checkNotNullParameter(encapsulatedKey, "encapsulatedKey");
        this.f20434a = encryptedTopic;
        this.f20435b = keyIdentifier;
        this.f20436c = encapsulatedKey;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Arrays.equals(this.f20434a, aVar.f20434a) && this.f20435b.contentEquals(aVar.f20435b) && Arrays.equals(this.f20436c, aVar.f20436c);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Arrays.hashCode(this.f20434a)), this.f20435b, Integer.valueOf(Arrays.hashCode(this.f20436c)));
    }

    public final String toString() {
        return om1.k("EncryptedTopic { ", "EncryptedTopic=" + a0.g(this.f20434a) + ", KeyIdentifier=" + this.f20435b + ", EncapsulatedKey=" + a0.g(this.f20436c) + " }");
    }
}
