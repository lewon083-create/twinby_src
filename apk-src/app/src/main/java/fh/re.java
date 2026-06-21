package fh;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import io.sentry.protocol.ViewHierarchyNode;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class re implements TemplateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f18237a;

    public re(sy syVar) {
        this.f18237a = syVar;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final oe resolve(ParsingContext parsingContext, te teVar, JSONObject jSONObject) {
        JsonFieldResolver.resolveOptionalExpression(parsingContext, teVar.f18634a, jSONObject, ViewHierarchyNode.JsonKeys.ALPHA, TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE, se.i, se.f18304a);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, teVar.f18635b, jSONObject, "content_alignment_horizontal", se.f18309f, v0.f18733v, se.f18305b);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, teVar.f18636c, jSONObject, "content_alignment_vertical", se.f18310g, v0.f18734w, se.f18306c);
        Field field = teVar.f18637d;
        sy syVar = this.f18237a;
        JsonFieldResolver.resolveOptionalList(parsingContext, field, jSONObject, "filters", syVar.f18455l3, syVar.f18434j3);
        JsonFieldResolver.resolveExpression(parsingContext, teVar.f18638e, jSONObject, "image_url", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, teVar.f18639f, jSONObject, "preload_required", TypeHelpersKt.TYPE_HELPER_BOOLEAN, ParsingConvertersKt.ANY_TO_BOOLEAN, se.f18307d);
        JsonFieldResolver.resolveOptionalExpression(parsingContext, teVar.f18640g, jSONObject, "scale", se.f18311h, be.f16940z, se.f18308e);
        return new oe();
    }
}
