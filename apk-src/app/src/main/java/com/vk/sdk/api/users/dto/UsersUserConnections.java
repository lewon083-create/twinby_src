package com.vk.sdk.api.users.dto;

import com.google.android.gms.internal.ads.om1;
import gf.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l7.o;
import ne.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import t.z;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata
public final class UsersUserConnections {

    @b("facebook")
    @NotNull
    private final String facebook;

    @b("facebook_name")
    @Nullable
    private final String facebookName;

    @b("instagram")
    @NotNull
    private final String instagram;

    @b("livejournal")
    @Nullable
    private final String livejournal;

    @b("skype")
    @NotNull
    private final String skype;

    @b("twitter")
    @NotNull
    private final String twitter;

    public UsersUserConnections(@NotNull String skype, @NotNull String facebook, @NotNull String twitter, @NotNull String instagram, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(skype, "skype");
        Intrinsics.checkNotNullParameter(facebook, "facebook");
        Intrinsics.checkNotNullParameter(twitter, "twitter");
        Intrinsics.checkNotNullParameter(instagram, "instagram");
        this.skype = skype;
        this.facebook = facebook;
        this.twitter = twitter;
        this.instagram = instagram;
        this.facebookName = str;
        this.livejournal = str2;
    }

    public static /* synthetic */ UsersUserConnections copy$default(UsersUserConnections usersUserConnections, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = usersUserConnections.skype;
        }
        if ((i & 2) != 0) {
            str2 = usersUserConnections.facebook;
        }
        if ((i & 4) != 0) {
            str3 = usersUserConnections.twitter;
        }
        if ((i & 8) != 0) {
            str4 = usersUserConnections.instagram;
        }
        if ((i & 16) != 0) {
            str5 = usersUserConnections.facebookName;
        }
        if ((i & 32) != 0) {
            str6 = usersUserConnections.livejournal;
        }
        String str7 = str5;
        String str8 = str6;
        return usersUserConnections.copy(str, str2, str3, str4, str7, str8);
    }

    @NotNull
    public final String component1() {
        return this.skype;
    }

    @NotNull
    public final String component2() {
        return this.facebook;
    }

    @NotNull
    public final String component3() {
        return this.twitter;
    }

    @NotNull
    public final String component4() {
        return this.instagram;
    }

    @Nullable
    public final String component5() {
        return this.facebookName;
    }

    @Nullable
    public final String component6() {
        return this.livejournal;
    }

    @NotNull
    public final UsersUserConnections copy(@NotNull String skype, @NotNull String facebook, @NotNull String twitter, @NotNull String instagram, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(skype, "skype");
        Intrinsics.checkNotNullParameter(facebook, "facebook");
        Intrinsics.checkNotNullParameter(twitter, "twitter");
        Intrinsics.checkNotNullParameter(instagram, "instagram");
        return new UsersUserConnections(skype, facebook, twitter, instagram, str, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UsersUserConnections)) {
            return false;
        }
        UsersUserConnections usersUserConnections = (UsersUserConnections) obj;
        return Intrinsics.a(this.skype, usersUserConnections.skype) && Intrinsics.a(this.facebook, usersUserConnections.facebook) && Intrinsics.a(this.twitter, usersUserConnections.twitter) && Intrinsics.a(this.instagram, usersUserConnections.instagram) && Intrinsics.a(this.facebookName, usersUserConnections.facebookName) && Intrinsics.a(this.livejournal, usersUserConnections.livejournal);
    }

    @NotNull
    public final String getFacebook() {
        return this.facebook;
    }

    @Nullable
    public final String getFacebookName() {
        return this.facebookName;
    }

    @NotNull
    public final String getInstagram() {
        return this.instagram;
    }

    @Nullable
    public final String getLivejournal() {
        return this.livejournal;
    }

    @NotNull
    public final String getSkype() {
        return this.skype;
    }

    @NotNull
    public final String getTwitter() {
        return this.twitter;
    }

    public int hashCode() {
        int iE = a.e(a.e(a.e(this.skype.hashCode() * 31, 31, this.facebook), 31, this.twitter), 31, this.instagram);
        String str = this.facebookName;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.livejournal;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.skype;
        String str2 = this.facebook;
        String str3 = this.twitter;
        String str4 = this.instagram;
        String str5 = this.facebookName;
        String str6 = this.livejournal;
        StringBuilder sbJ = z.j("UsersUserConnections(skype=", str, ", facebook=", str2, ", twitter=");
        o.t(sbJ, str3, ", instagram=", str4, ", facebookName=");
        return om1.n(sbJ, str5, ", livejournal=", str6, ")");
    }

    public /* synthetic */ UsersUserConnections(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6);
    }
}
