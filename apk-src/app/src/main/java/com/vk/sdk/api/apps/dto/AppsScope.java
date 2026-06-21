package com.vk.sdk.api.apps.dto;

import io.sentry.rrweb.RRWebVideoEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ne.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata
public final class AppsScope {

    @b("name")
    @NotNull
    private final Name name;

    @b("title")
    @Nullable
    private final String title;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public enum Name {
        FRIENDS("friends"),
        PHOTOS("photos"),
        VIDEO(RRWebVideoEvent.EVENT_TAG),
        PAGES("pages"),
        STATUS("status"),
        NOTES("notes"),
        WALL("wall"),
        DOCS("docs"),
        GROUPS("groups"),
        STATS("stats"),
        MARKET("market");


        @NotNull
        private final String value;

        Name(String str) {
            this.value = str;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    public AppsScope(@NotNull Name name, @Nullable String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.title = str;
    }

    public static /* synthetic */ AppsScope copy$default(AppsScope appsScope, Name name, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            name = appsScope.name;
        }
        if ((i & 2) != 0) {
            str = appsScope.title;
        }
        return appsScope.copy(name, str);
    }

    @NotNull
    public final Name component1() {
        return this.name;
    }

    @Nullable
    public final String component2() {
        return this.title;
    }

    @NotNull
    public final AppsScope copy(@NotNull Name name, @Nullable String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new AppsScope(name, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsScope)) {
            return false;
        }
        AppsScope appsScope = (AppsScope) obj;
        return this.name == appsScope.name && Intrinsics.a(this.title, appsScope.title);
    }

    @NotNull
    public final Name getName() {
        return this.name;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        String str = this.title;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "AppsScope(name=" + this.name + ", title=" + this.title + ")";
    }

    public /* synthetic */ AppsScope(Name name, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(name, (i & 2) != 0 ? null : str);
    }
}
