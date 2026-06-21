package com.vk.sdk.api.widgets.dto;

import com.google.android.gms.internal.ads.om1;
import com.vk.sdk.api.users.dto.UsersUserFull;
import io.sentry.SentryBaseEvent;
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
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata
public final class WidgetsCommentRepliesItem {

    @b("cid")
    @Nullable
    private final Integer cid;

    @b("date")
    @Nullable
    private final Integer date;

    @b("likes")
    @Nullable
    private final WidgetsWidgetLikes likes;

    @b("text")
    @Nullable
    private final String text;

    @b("uid")
    @Nullable
    private final Integer uid;

    @b(SentryBaseEvent.JsonKeys.USER)
    @Nullable
    private final UsersUserFull user;

    public WidgetsCommentRepliesItem() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ WidgetsCommentRepliesItem copy$default(WidgetsCommentRepliesItem widgetsCommentRepliesItem, Integer num, Integer num2, WidgetsWidgetLikes widgetsWidgetLikes, String str, Integer num3, UsersUserFull usersUserFull, int i, Object obj) {
        if ((i & 1) != 0) {
            num = widgetsCommentRepliesItem.cid;
        }
        if ((i & 2) != 0) {
            num2 = widgetsCommentRepliesItem.date;
        }
        if ((i & 4) != 0) {
            widgetsWidgetLikes = widgetsCommentRepliesItem.likes;
        }
        if ((i & 8) != 0) {
            str = widgetsCommentRepliesItem.text;
        }
        if ((i & 16) != 0) {
            num3 = widgetsCommentRepliesItem.uid;
        }
        if ((i & 32) != 0) {
            usersUserFull = widgetsCommentRepliesItem.user;
        }
        Integer num4 = num3;
        UsersUserFull usersUserFull2 = usersUserFull;
        return widgetsCommentRepliesItem.copy(num, num2, widgetsWidgetLikes, str, num4, usersUserFull2);
    }

    @Nullable
    public final Integer component1() {
        return this.cid;
    }

    @Nullable
    public final Integer component2() {
        return this.date;
    }

    @Nullable
    public final WidgetsWidgetLikes component3() {
        return this.likes;
    }

    @Nullable
    public final String component4() {
        return this.text;
    }

    @Nullable
    public final Integer component5() {
        return this.uid;
    }

    @Nullable
    public final UsersUserFull component6() {
        return this.user;
    }

    @NotNull
    public final WidgetsCommentRepliesItem copy(@Nullable Integer num, @Nullable Integer num2, @Nullable WidgetsWidgetLikes widgetsWidgetLikes, @Nullable String str, @Nullable Integer num3, @Nullable UsersUserFull usersUserFull) {
        return new WidgetsCommentRepliesItem(num, num2, widgetsWidgetLikes, str, num3, usersUserFull);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WidgetsCommentRepliesItem)) {
            return false;
        }
        WidgetsCommentRepliesItem widgetsCommentRepliesItem = (WidgetsCommentRepliesItem) obj;
        return Intrinsics.a(this.cid, widgetsCommentRepliesItem.cid) && Intrinsics.a(this.date, widgetsCommentRepliesItem.date) && Intrinsics.a(this.likes, widgetsCommentRepliesItem.likes) && Intrinsics.a(this.text, widgetsCommentRepliesItem.text) && Intrinsics.a(this.uid, widgetsCommentRepliesItem.uid) && Intrinsics.a(this.user, widgetsCommentRepliesItem.user);
    }

    @Nullable
    public final Integer getCid() {
        return this.cid;
    }

    @Nullable
    public final Integer getDate() {
        return this.date;
    }

    @Nullable
    public final WidgetsWidgetLikes getLikes() {
        return this.likes;
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    @Nullable
    public final Integer getUid() {
        return this.uid;
    }

    @Nullable
    public final UsersUserFull getUser() {
        return this.user;
    }

    public int hashCode() {
        Integer num = this.cid;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.date;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        WidgetsWidgetLikes widgetsWidgetLikes = this.likes;
        int iHashCode3 = (iHashCode2 + (widgetsWidgetLikes == null ? 0 : widgetsWidgetLikes.hashCode())) * 31;
        String str = this.text;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num3 = this.uid;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        UsersUserFull usersUserFull = this.user;
        return iHashCode5 + (usersUserFull != null ? usersUserFull.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Integer num = this.cid;
        Integer num2 = this.date;
        WidgetsWidgetLikes widgetsWidgetLikes = this.likes;
        String str = this.text;
        Integer num3 = this.uid;
        UsersUserFull usersUserFull = this.user;
        StringBuilder sbO = om1.o("WidgetsCommentRepliesItem(cid=", ", date=", num, num2, ", likes=");
        sbO.append(widgetsWidgetLikes);
        sbO.append(", text=");
        sbO.append(str);
        sbO.append(", uid=");
        sbO.append(num3);
        sbO.append(", user=");
        sbO.append(usersUserFull);
        sbO.append(")");
        return sbO.toString();
    }

    public WidgetsCommentRepliesItem(@Nullable Integer num, @Nullable Integer num2, @Nullable WidgetsWidgetLikes widgetsWidgetLikes, @Nullable String str, @Nullable Integer num3, @Nullable UsersUserFull usersUserFull) {
        this.cid = num;
        this.date = num2;
        this.likes = widgetsWidgetLikes;
        this.text = str;
        this.uid = num3;
        this.user = usersUserFull;
    }

    public /* synthetic */ WidgetsCommentRepliesItem(Integer num, Integer num2, WidgetsWidgetLikes widgetsWidgetLikes, String str, Integer num3, UsersUserFull usersUserFull, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : widgetsWidgetLikes, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : num3, (i & 32) != 0 ? null : usersUserFull);
    }
}
