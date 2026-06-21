package com.vk.sdk.api.aliexpress.dto;

import a0.u;
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
public final class AliexpressBlockPanel {

    @b("photo_124")
    @Nullable
    private final String photo124;

    @b("photo_186")
    @Nullable
    private final String photo186;

    @b("photo_62")
    @Nullable
    private final String photo62;

    @b("subtitle")
    @Nullable
    private final String subtitle;

    @b("title")
    @NotNull
    private final String title;

    public AliexpressBlockPanel(@NotNull String title, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
        this.subtitle = str;
        this.photo62 = str2;
        this.photo124 = str3;
        this.photo186 = str4;
    }

    public static /* synthetic */ AliexpressBlockPanel copy$default(AliexpressBlockPanel aliexpressBlockPanel, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aliexpressBlockPanel.title;
        }
        if ((i & 2) != 0) {
            str2 = aliexpressBlockPanel.subtitle;
        }
        if ((i & 4) != 0) {
            str3 = aliexpressBlockPanel.photo62;
        }
        if ((i & 8) != 0) {
            str4 = aliexpressBlockPanel.photo124;
        }
        if ((i & 16) != 0) {
            str5 = aliexpressBlockPanel.photo186;
        }
        String str6 = str5;
        String str7 = str3;
        return aliexpressBlockPanel.copy(str, str2, str7, str4, str6);
    }

    @NotNull
    public final String component1() {
        return this.title;
    }

    @Nullable
    public final String component2() {
        return this.subtitle;
    }

    @Nullable
    public final String component3() {
        return this.photo62;
    }

    @Nullable
    public final String component4() {
        return this.photo124;
    }

    @Nullable
    public final String component5() {
        return this.photo186;
    }

    @NotNull
    public final AliexpressBlockPanel copy(@NotNull String title, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new AliexpressBlockPanel(title, str, str2, str3, str4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AliexpressBlockPanel)) {
            return false;
        }
        AliexpressBlockPanel aliexpressBlockPanel = (AliexpressBlockPanel) obj;
        return Intrinsics.a(this.title, aliexpressBlockPanel.title) && Intrinsics.a(this.subtitle, aliexpressBlockPanel.subtitle) && Intrinsics.a(this.photo62, aliexpressBlockPanel.photo62) && Intrinsics.a(this.photo124, aliexpressBlockPanel.photo124) && Intrinsics.a(this.photo186, aliexpressBlockPanel.photo186);
    }

    @Nullable
    public final String getPhoto124() {
        return this.photo124;
    }

    @Nullable
    public final String getPhoto186() {
        return this.photo186;
    }

    @Nullable
    public final String getPhoto62() {
        return this.photo62;
    }

    @Nullable
    public final String getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.photo62;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.photo124;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.photo186;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        String str3 = this.photo62;
        String str4 = this.photo124;
        String str5 = this.photo186;
        StringBuilder sbJ = z.j("AliexpressBlockPanel(title=", str, ", subtitle=", str2, ", photo62=");
        o.t(sbJ, str3, ", photo124=", str4, ", photo186=");
        return u.o(sbJ, str5, ")");
    }

    public /* synthetic */ AliexpressBlockPanel(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }
}
