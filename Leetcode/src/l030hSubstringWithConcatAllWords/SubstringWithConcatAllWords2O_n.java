package l030hSubstringWithConcatAllWords;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubstringWithConcatAllWords2O_n {

/**
"barfoofoobarthefoobarman"
{"bar","foo","the"}

"wordgoodgoodgoodbestword"
{"word","good","best","good"}

"barfoothefoobarman"
{"foo","bar"}

"foobarfoobar"
{"foo","bar"}

"aaa"
{"a","a"}

"abababab"
{"a","b"}

"pjzkrkevzztxductzzxmxsvwjkxpvukmfjywwetvfnujhweiybw
vvsrfequzkhossmootkmyxgjgfordrpapjuunmqnxxdrqrfgkrs
jqbszgiqlcfnrpjlcwdrvbumtotzylshdvccdmsqoadfrpsvnwp
izlwszrtyclhgilklydbmfhuywotjmktnwrfvizvnmfvvqfiokkd
prznnnjycttprkxpuykhmpchiksyucbmtabiqkisgbhxngmhezrr
qvayfsxauampdpxtafniiwfvdufhtwajrbkxtjzqjnfocdhekum
ttuqwovfjrgulhekcpjszyynadxhnttgmnxkduqmmyhzfnjhduce
sctufqbumxbamalqudeibljgbspeotkgvddcwgxidaiqcvgwykh
bysjzlzfbupkqunuqtraxrlptivshhbihtsigtpipguhbhctcvubn
hqipncyxfjebdnjyetnlnvmuxhzsdahkrscewabejifmxombia
mxvauuitoltyymsarqcuuoezcbqpdaprxmsrickwpgwpsoplhugb
ikbkotzrtqkscekkgwjycfnvwfgdzogjzjvpcvixnsqsxacfwnd
zvrwrycwxrcismdhqapoojegggkocyrdtkzmiekhxoppctytvphjy
nrhtcvxcobxbcjjivtfjiwmduhzjokkbctweqtigwfhzorjlkp
uuliaipbtfldinyetoybvugevwvhhhweejogrghllsouipabfaf
cxnhukcbtmxzshoyyufjhzadhrelweszbfgwpkzlwxkogyogutsc
vuhcllphshivnoteztpxsaoaacgxyaztuixhunrowzljqfqrahosh
eukhahhbiaxqzfmmwcjxountkevsvpbzjnilwpoermxrtlfroq
oclexxisrdhvfsindffslyekrzwzqkpeocilatftymodgztjgybty
heqgcpwogdcjlnlesefgvimwbxcbzvaibspdjnrpqtyeilkcsp
knyylbwndvkffmzuriilxagyerjptbgeqgebiaqnvdubrtxibhvakc
yotkfonmseszhczapxdlauexehhaireihxsplgdgmxfvaevrb
adbwjbdrkfbbjjkgcztkcbwagtcnrtqryuqixtzhaakjlurnumzyo
vawrcjiwabuwretmdamfkxrgqgcdgbrdbnugzecbgyxxdqmisa
qcyjkqrntxqmdrczxbebemcblftxplafnyoxqimkhcykwamvdsxjezk
pgdpvopddptdfbprjustquhlazkjfluxrzopqdstulybnqvy
knrchbphcarknnhhovweaqawdyxsqsqahkepluypwrzjegqtdoxfgzdk
ydeoxvrfhxusrujnmjzqrrlxglcmkiykldbiasnhrjbjeky
stzilrwkzhontwmehrfsrzfaqrbbxncphbzuuxeteshyrveamjsfiaha
rkcqxefghgceeixkdgkuboupxnwhnfigpkwnqdvzlydpidc
ljmflbccarbiegsmweklwngvygbqpescpeichmfidgsjmkvkofvkue
hsmkkbocgejoiqcnafvuokelwuqsgkyoekaroptuvekfvmtxt
qshcwsztkrzwrpabqrrhnlerxjojemcxel"
{"dhvf","sind","ffsl","yekr","zwzq","kpeo","cila","tfty","modg",
"ztjg","ybty","heqg","cpwo","gdcj","lnle","sefg","vimw","bxcb"}

"abababababababababababababababababababababababababa
bababababababababababababababababababababababababab
abababababababababababababababababababababababababab
abababababababababababababababababababababababababa
babababababababababababababababababababababababababababa
bababababababababababababababababababababababab
abababababababababababababababababababababababababab
abababababababababababababababababababababababababa
bababababababababababababababababababababababababababab
abababababababababababababababababababababababab
abababababababababababababababababababababababababab
abababababababababababababababababababababababababa
babababababababababababababababababababababababababababab
ababababababababababababababababababababababab
ababababababababababababababababababababababababababababa
bababababababababababababababababababababababa
bababababababababababababababababababababababababababa
babababababababababababababababababababababababab
abababababababababababababababababababababababababababa
babababababababababababababababababababababababa
bababababababababababababababababababababababababababab
abababababababababababababababababababababababab
ababababababababababababababababababababababababababa
bababababababababababababababababababababababababa
babababababababababababababababababababababababababab
ababababababababababababababababababababababababab
abababababababababababababababababababababababababa
babababababababababababababababababababababababababa
bababababababababababababababababababababababababa
babababababababababababababababababababababababababab
ababababababababababababababababababababababababab
ababababababababababababababababababababababababababa
babababababababababababababababababababababababab
ababababababababababababababababababababababababababab
abababababababababababababababababababababababab
abababababababababababababababababababababababababababa
babababababababababababababababababababababababa
bababababababababababababababababababababababababababab
abababababababababababababababababababababababababababababa
babababababababababababababababababababababa
babababababababababababababababababababababababab
ababababababababababababababababababababababababababab
abababababababababababababababababababababababababababa
babababababababababababababababababababababababa
babababababababababababababababababababababababababab
ababababababababababababababababababababababababab
ababababababababababababababababababababababababababa
bababababababababababababababababababababababababa
babababababababababababababababababababababababababab
ababababababababababababababababababababababababab
ababababababababababababababababababababababababababab
ababababababababababababababababababababababababa
bababababababababababababababababababababababababababa
babababababababababababababababababababababababab
ababababababababababababababababababababababababababab
ababababababababababababababababababababababababa
babababababababababababababababababababababababababab
ababababababababababababababababababababababababab
ababababababababababababababababababababababababababab
ababababababababababababababababababababababababa
bababababababababababababababababababababababababababa
babababababababababababababababababababababababab
abababababababababababababababababababababababababab
abababababababababababababababababababababababababa
babababababababababababababababababababababababababababa
bababababababababababababababababababababababab
abababababababababababababababababababababababababababababab
abababababababababababababababababababababa
bababababababababababababababababababababababababababa
babababababababababababababababababababababababab
ababababababababababababababababababababababababababa
bababababababababababababababababababababababababa
babababababababababababababababababababababababababa
bababababababababababababababababababababababababab
abababababababababababababababababababababababababababa
babababababababababababababababababababababababa
babababababababababababababababababababababababababab
ababababababababababababababababababababababababab
ababababababababababababababababababababababababababa
bababababababababababababababababababababababababa
babababababababababababababababababababababababababab
ababababababababababababababababababababababababab
ababababababababababababababababababababababababababa
bababababababababababababababababababababababababa
babababababababababababababababababababababababababab
ababababababababababababababababababababababababab
ababababababababababababababababababababababababababa
bababababababababababababababababababababababababa
bababababababababababababababababababababababababababa
babababababababababababababababababababababababab
abababababababababababababababababababababababababababa
babababababababababababababababababababababababa
bababababababababababababababababababababababababababab
abababababababababababababababababababababababab
ababababababababababababababababababababababababababababa
bababababababababababababababababababababababa
babababababababababababababababababababababababababababa
bababababababababababababababababababababababab
abababababababababababababababababababababababababababa
babababababababababababababababababababababababa
bababababababababababababababababababababababababababa
babababababababababababababababababababababababab
ababababababababababababababababababababababababababa
bababababababababababababababababababababababababa
bababababababababababababababababababababababababababa
babababababababababababababababababababababababab
ababababababababababababababababababababababababababab
ababababababababababababababababababababababababa
bababababababababababababababababababababababababababab
abababababababababababababababababababababababab
abababababababababababababababababababababababababababab
abababababababababababababababababababababababa
bababababababababababababababababababababababababababababa
babababababababababababababababababababababab
ababababababababababababababababababababababababababababab
ababababababababababababababababababababababa
babababababababababababababababababababababababababababababa
bababababababababababababababababababababab
abababababababababababababababababababababababababababababa
babababababababababababababababababababababa
bababababababababababababababababababababababababababa
babababababababababababababababababababababababab
abababababababababababababababababababababababababababa
babababababababababababababababababababababababa
babababababababababababababababababababababababababababababa
bababababababababababababababababababababab
abababababababababababababababababababababababababababab
abababababababababababababababababababababababa
babababababababababababababababababababababababababababab
ababababababababababababababababababababababab
ababababababababababababababababababababababababababab
ababababababababababababababababababababababababa
babababababababababababababababababababababababababa
bababababababababababababababababababababababababab
abababababababababababababababababababababababababababa
babababababababababababababababababababababababa
bababababababababababababababababababababababababababab
abababababababababababababababababababababababab
ababababababababababababababababababababababababababab
ababababababababababababababababababababababababa
bababababababababababababababababababababababababababababababababababababababababababababababababababab
abababababababababababababababababababababababababababababababababababababababababababababababababababa
bababababababababababababababababababababababababababababababababababababababababababababababababababab
abababababababababababababababababababababababababababababababababababababababababababababababababababa
bababababababababababababababababababababababababababababababababababababababababababababababababababab
abababababababababababababababababababababababababababababababababababababababababababababababababababa
bababababababababababababababababababababababababababababababababababababababababababababababababababab
abababababababababababababababababababababababababababababababababababababababababababababababababababa
bababababababababababababababababababababababababababababababababababababababababababababababababababab
abababababababababababababababababababababababababababababababababababababababababababababababababababa
bababababababababababababababababababababababababababababababababababababababababababababababababababab
abababababababababababababababababababababababababababababababababababababababababababababababababababa
bababababababababababababababababababababababababababababababababababababababababababababababababababab
abababababababababababababababababababababababababababababababababababababababababababababababababababa
bababababababababababababababababababababababababababababababababababababababababababababababababababab
abababababababababababababababababababababababababababababababababababababababababababababababababababa
bababababababababababababababababababababababababababababababababababababababababababababababababababab
abababababababababababababababababababababababababababababababababababababababababababababababababababa
bababababababababababababababababababababababababababababababababababababababababababababababababababab
abababababababababababababababababababababababababababababababababababababababababababababababababababa
bababababababababababababababababababababababababababababababababababababababababababababababababababab
abababababababababababababababababababababababababababababababababababababababababababababababababababa
bababababababababababababababababababababababababababababababababababababababababababababababababababab
abababababababababababababababababababababababababababababababababababababababababababababababababababa
bababababababababababababababababababababababababababababababababababababababababababababababababababab
abababababababababababababababababababababababababababababababababababababababababababababababababababa
babababababababababababababababababababababababababababab
abababababababababababababababababababababababababababab"
{"ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba",
"ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba",
"ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba",
"ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba",
"ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba",
"ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba",
"ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba",
"ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba",
"ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba",
"ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba"}

"xjpguhvytyjcknhjqkwelhjqbdgtwxgvgxbdeydxwozidiutuqafxjxaodtkdbfjyiocgtbfhcplmjggbgoarlcgpxssyadyiuapndw
xhlitvoayvqzobbuqzpkzpqyzkaqzgmwnyghvvjtszuiawdtxufylvwkhzbhfpfsnmbkjkedlylowqjvkquxmsivrlewakrqysahfgmq
hxgfqpbcgxaupkrhvwfviwngrqpwybohaxnsoqvwpxqehkncgvzqtpwkflidoznqwcjksehjdzpkjdmranhtcfejsopgncxjeguymbhp
cwbmbpfbcnvhsbqnpftdjsonainoludqtgcwvjyywvhryxepfzuqsjgstthhqmxltbhokfojcvcavgqchmszvyupudykrvvmwedikrro
ptrmbjojvgkrheibjgnbdknboqjakbpbwgnyrbhmjtfqantjvgmaqcbhulhgowhkeukvxrkhnpznfvwcdldwnedjpkqfjxqnualruvah
mcwrxuuafxwubzetmwyvtqkntvhnshwhjsyimujuthoxjuqvqqqmhazayipsqnzbfaktuvpocennadirvadcdeedpvvfixipxujtpaju
gwhhbsaxsfbvliaadwhmvqbsmmnenxavvhcxbcwwjxtvfuvlqdxlvafhpsnernznxemygiuqfonniiyanxnkzuuoohugvwvsajsirnyy
dnnnwnplkcwkyqamxvuurrmrafztuauzphmlvdzhfvrflurkpmfidtbgycbuevtufhhakgjrdbwqvqbmciwhbxpcbrwgmscrbjtmsffv
gemdupryxphaoxcpobxcvbwwnrkfwscewqjsfcqerzffwjxmmwrhynelgosfiujenvwsxozpogwmrtbeqslqhrbnitsqpevcztxykyna
emmvhnbzhnpogqeolyfdccfdxecjcrjidyelnhmvuclduprioylscswaxylbpvkvvqikxuhuytxtkqbapottgrvfphjgetdzjljigrce
mbzwsczjqsczlygcfpijkmktzvehmgoaknzcqylisnjdlqfshpbsdnndjrkxayykoxogxzqpoascsxubmytsljvuahucisowrccobuds
uxuouoqimlaauxwxhqbpkqldsptwjyogviurymclyenueltlcvaollufcnbnmptjzqbycflcjyxnjsynnaealygpljdzzyjyomyrtjvc
hustnsgctkdgklwwubxvziwouuhpecslxmgmepoxbremcckzdhucqqqmlzcpcwcbilnmabkbtqpxszwvhtzzjslwrnntlsutdjgflsig
kyfcxezexydiqrfigudsmalrjtwunfcxdibcmajjbotrfybmtfghftzqpxlcepcjxdmlgvwhjqarqcdlhltoeuettryyhahgfvsnqquc
gxtzzykijfwpbcjvujvdjelqadeswawcxpdwpoeyvcqxfzubipetvpjxvpqtqmxpebotpuumxkjelffvwlosczpzrhsjwqycrmvihrug
bgkolrjiezcgbtisbadzsbblqytzsqfvyrklitvmvxuyrcqufvvzwyloygnqwsmwjwitrdhobcmugcqnzlnwlykjeaadsmzekhxdlhso
jekrjafinseysrjyrjblxbrjkrnvyflhjvasxfbkzhkraustdtfdwymhpzengqwqnxklelvetixvcpphjwkhuzokavxhlwzatjlxxjdq
rbnvsccdypltqzdswcbhyaktmxrjgwbzxowqrzvpqgkiipaescoscymovfxebyfbpctgdoxvxidfxdjrfzmkxaavhabiyilpkevpvvks
fpzetiwakkkjklgrlhblqnbctyuqtgkawjfrubrenenxpuqcdrptgsyctusmadnyospivhminahewxgzoxvxqtzjntxpymongdvdmknz
kudirlhijchbxgkmbjcawsnevkikuvjgspolcyvlacmakymmiqmgibkensqiqbqiqfttdpgfrvfevsqdkelthwzuqpegqvqjakefbmku
hsyfmokwswpbsqwkfatyvjjxvncwzprjhpoteypywhcqxybfaufyfovbbaxcponygdrkeikarmrrmuwnqblvpiwsiuwzkkxqnqctbpus
dnlqhhfxkssbapvllskvekmtcqndfhyjujbdtgafauhclenwwaucmiwoyjugqupmfspaarganpcztqxssruebqucbqirkzfsrwsrnard
pvclnzfftblusgyvwgnjfudyrvpgwijngnatnfbihmebudwtjlerihrbchjartqzistxyufhikkdpiwauarejjfnsooljglsygpyaxhi
jrnyalywnsawdfkxtaidgvxgbmhdloougbsipteclezqljnejvjrtgzuvgygvoddrxlgqrjdxititgoeeavxiwrfdroahrdzoqfhhokg
ygormevsespnpjsscgukzxjopoxyfjedpuxeyswfnoucxmwbvqlwpwmgljestkviesoennjabfeauabpsnljjapwjvochmnngbrvodxr
ibredttvihgthxsssivbwkodniaelyvvzpadkvasejnngfgbqdcmprpczqgmoejptlsdjvxpekdmslniqqufjmhieqwuufjntescbpth
byttjhdbzaiiosssioocvzrqdjugaonbmhxyqczpcixqarkkfaocaftfqnmsbbtqisoyvppxzoqbfclmdzpdgkiyxwqbymtiehjzyyzy
nrzutnhymwbvimvhkmiiadtekcgjafjpyikrvtqkrthzhcgsqrcquvxhxdsakbrkldbjwttnpcowgvqzotriqorotjqfmhpylthhocxd
elcmiulwpdhgtywpkmuwvmugfbqtfpzlcdylxjhnoovkprzzdtvafqjmtbizqhmsmkdlwnykdtusmvrrpnswfbjacrbuaommysxwhyjk
tdfgzwzqlrmssxtwowqqkfclxchgcqqvwvdxudnhwbarzvnpregclknkowqqniojgtgayvhvyjozebpwhxasjncajuqydghjcplakuxl
elkipbgwygrkvvkfqcdvlnenerpplpapcmatogqmnjyiekpwpvrakxpoqgfcxhtcutvicnwrwvbdhtbwovyaupolyunxdizxcvfgiezh
bamitnhjkhjfxaqxwfuznuzppgxzkwilxuuskdewkpbhprenwbpkvobmubnfxwqwsmrepvbakejcwqpuregmukaplnuklmjgzamqxpqj
ualsqdmhjvvefxtskpeybngcpstmilweljwdoimyfhcmgxermlrpyxuqrnebycfmmbpamcyrlceszkllvedwbxmumqwktbyhdojrskid
moxmbizymeupbimnbiawlydoomfgyqmlgjzhuygifcagnmwowykhypyndfvcvhpetolpotztybclpyblwlvuctjhyflwoaajonydhawf
bysrytewgztiucrvhdrydthsgixpkvwlwoeujlrpmkzhorcywvwzoftwnsoxoklkbrekcxcrjdyywcwszsupxnlngbmwmxgprmbvkdmt
hmrdqnyphsehhsuptilhiryzeauqdhjmtdsmqqbakihtcdjxluhtofsufpklwvxryrdrjhrtpyntdyqouxkideeitotrmtlkkqbuxspo
schvaamxxyfccknyairmbczovaiuvzjneslguzdsxjwbvjzxsrmvvljqntlitwyxqldlkjfjsbkpnmohfaecnqtblgleelduwjhismtm
qgdfurozusbhkwkweyckjihitosldozvuccovqppksxvrjtxhvitdrbwfvjkjkhdmjtkbizodyluietpzbifslbahnmqxuwmfpwjaxzd
wkzeqstrweworaqypfrmznagewreuqjqaiwsdrkzvgpnignxnemotmuylmcheozhyvzbmjaksqzcyoclvozocvmnjrwofvvdswhhghta
zucziekdulsxjgkszjieefkxcrekaxkatozbtmhnzbmihzdhinnmtzlxsrjtqtvjjwleksukvgucfzlnpbcianhthqoxllhuhuzsotej
banhazwpcyzcoixvanulydhgxganbeydgmminizphatxitsigmvfqdnplnfptdszrgieohvxirwskodqdyxvdkmpzresxyuoeevunsux
jqqthvkmthhxuvotnsoksiayovsboobzfttoofahmhggcucroqdgaeeqbzrppupunkkbpkldtrkymopcgvjgzpwaopsekjaxtlzixklt
dxrrliurddzesxfjnzpzipwbcxlcjwvpwmghwabafcgyanjnmymupkxukiwvhtkdhrmdrnfxsmxszihogtixfirpsplzixcrorvigcfy
qeqqmxeusoraylprccsnaveqobyueftullmxjstdjndhavacztpzqusevqybwtwhfihodctmpxvpswurpjthfllddlezfcjknsaquvcm
sxdmvzemjztqkgtpsarzcalpunhqiledlipgjttsuolgvewpenohnbyjogzyrebeorlxmgshudnpjjgowwxlxxunfwmzapdqgonvuhcr
kriubpkzljnlghymdmlfcqvkflfbsjsfbdbculdfwqscatqffdljuiubvbcqlxvmcwqwjvbhmwjmpcrufegbpackdhaoexcgvucgqfnc
bzqsbjniotkfvmpytspzprflmjrerhgugynhhapxvzcsosqhmhjbzqonaittpznvzaegctezvgrjaksorbsssghuqanhbaeadihfenfz
vykwiekcgcualeubejlglpioyrwceddabnymrioznkbaoxdtgobsejicbeghhjhjyfvrqltfvufksifyxgsdrbhufncnyjywrvphgimd
dtnxbsxayqdsrkmyxonxantrilaqtouyhjvicvlclouebjeaxsyxftqqeqgaecynmwyqrjuexpiyymbxgzxmsnexgkxmpxabvytmhnsg
eahepicxhbjbonywaxjrxlusjnhsazyfchlrpnqyqaahpadryoivzepkrwcuwdbykmrachasjazbbfsbtdwvhnfbkivgnwgxkxzmeahq
agrbnlchqacaqjbatyigwoggnfvtfcjikclyoqheslgiuhiohswdickvihrpjaxtflttbaztlgcgpmwxhsapvmnfteueguylfrgiugbf
mflduhadcdsxphellypuupfbjojduniiuwlqfothrmggvkthljdfakjjysoshzcevquceokvcqdxbxgoijtkucwuxknglrkghfjlvviz
nowqnfexqyhkcdfbquibnskvzviwstvfhuwubatraaedglgwfozujlpkgahategcacybcrtftxiziqxpfxjqibcrdlryqzasbaugrplm
mvmwljnsgwkrznkcydaqdcjgcfmvuziguweifrcopnhpcrtcuwtzyegdjsadsklogryoibczqjquckwygrygxeliymlswyhfphtxkxza
ipwmzvkhoiomobunnifmgorwwmvgjujtmhflcpvraldomzbahjmqzfovrjecgpvuwafzrcqrnvicwlceuqwuxkrqvxsdmpxjrfkihccx
zmzvxdbuvxqshhkdhcgttgeklousqyrpkqnitocqoskvbuaiwjeppibcxwupumhfeupakrqylbwovyxujblalncilxaflhmrdbrpuiqh
lmwgmvawyowjbzumyutldicilwxggnprblzoicmgqkqrjkfjgywjgbrsxoaderwffvvnxhunsmedwjpcklnqogklwmqaemijidyfnsvf
ezkclzgvntnbbypymfysugdemcjzuggbgqftqmofhbgjbvhqdhixqmbcomdktjnbzturhkwonfxpagffqpegdfitulgpwtsvoopvylkl
qjctsjaizfoemyyglexhxpeodtjdhtpzftuxdvfeavimtgvemslmkranljtsfkrkdmjghomjjxvedqislvevmekzndtsnlerznzidoro
losqhciszmnoszngdhasuflvundybwommhetlpnlbczucochvczrjlmgyrgbnuncdtvpilamnbippkwnoyeajrijiokyizaosxddifpw
iznxlmkbkpdvileqzqqkpqyjodoyifuseippuctgtwbbihthxktmarxqwmpgrjyytonpsgvldymnffwepqssjqigexovjntedjwvrtgw
ssjzzgepywhjorpsreoctjgwucrmyxksrurqcxhcuoliidbzhrbccjyxoplmovefrxxvvfxpvjzdmcevvfxyrvxfmkrcfxjzugurnsij
diormtmialirihyurryyohxlnucbmlmrvaihvwpyhzrrgqnxhlwysvjhplkdywutzebwaswjsoaygnwnyunqpwahkkkijhcilfgmxdvp
twqzlmokicczycgkprtyyxijcoxbtvrmthlevcodetcexlpmckkcjunljlmegfrboeflgwqmpvrmgibiulmdgzqrmcvukmvatbmzxemo
zfafndpjpdmxdcqrglmsajttkhujniznncucfklunxtsbjkixyczhv
uueofsxfhmhbpmnchdccxdmhnlhqkpneluuqotvvgcyxpmzyrdaojo"
{"twjyogviurymclyenueltlcvao","tmilweljwdoimyfhcmgxermlrp","ikuvjgspolcyvlacmakymmiqmg",
"agrbnlchqacaqjbatyigwoggnf","mbzwsczjqsczlygcfpijkmktzv","vljqntlitwyxqldlkjfjsbkpnm",
"beqslqhrbnitsqpevcztxykyna","usqyrpkqnitocqoskvbuaiwjep","ibkensqiqbqiqfttdpgfrvfevs",
"wszsupxnlngbmwmxgprmbvkdmt","fpzetiwakkkjklgrlhblqnbcty","sxdmvzemjztqkgtpsarzcalpun",
"wceddabnymrioznkbaoxdtgobs","hpecslxmgmepoxbremcckzdhuc","ztuauzphmlvdzhfvrflurkpmfi",
"ptrmbjojvgkrheibjgnbdknboq","vgjujtmhflcpvraldomzbahjmq","ygormevsespnpjsscgukzxjopo",
"qdkelthwzuqpegqvqjakefbmku","hsazyfchlrpnqyqaahpadryoiv","ickvihrpjaxtflttbaztlgcgpm",
"hnshwhjsyimujuthoxjuqvqqqm","ejicbeghhjhjyfvrqltfvufksi","hustnsgctkdgklwwubxvziwouu",
"jrfzmkxaavhabiyilpkevpvvks","reuqjqaiwsdrkzvgpnignxnemo","wyloygnqwsmwjwitrdhobcmugc",
"fvwlosczpzrhsjwqycrmvihrug","ehmgoaknzcqylisnjdlqfshpbs","irvadcdeedpvvfixipxujtpaju",
"mcwrxuuafxwubzetmwyvtqkntv","lcjwvpwmghwabafcgyanjnmymu","hdloougbsipteclezqljnejvjr",
"hmrdqnyphsehhsuptilhiryzea","wunfcxdibcmajjbotrfybmtfgh","aeeqbzrppupunkkbpkldtrkymo",
"rbnvsccdypltqzdswcbhyaktmx","jqqthvkmthhxuvotnsoksiayov","uqtgkawjfrubrenenxpuqcdrpt",
"mvmwljnsgwkrznkcydaqdcjgcf","wcdldwnedjpkqfjxqnualruvah","bamitnhjkhjfxaqxwfuznuzppg",
"moxmbizymeupbimnbiawlydoom","xyfjedpuxeyswfnoucxmwbvqlw","aftfqnmsbbtqisoyvppxzoqbfc",
"zepkrwcuwdbykmrachasjazbbf","akjjysoshzcevquceokvcqdxbx","pcgvjgzpwaopsekjaxtlzixklt",
"zucziekdulsxjgkszjieefkxcr","jrnyalywnsawdfkxtaidgvxgbm","xpkvwlwoeujlrpmkzhorcywvwz",
"qzotriqorotjqfmhpylthhocxd","wymhpzengqwqnxklelvetixvcp","ceuqwuxkrqvxsdmpxjrfkihccx",
"iwstvfhuwubatraaedglgwfozu","ohfaecnqtblgleelduwjhismtm","ekaxkatozbtmhnzbmihzdhinnm",
"uvxhxdsakbrkldbjwttnpcowgv","vafhpsnernznxemygiuqfonnii","sbtdwvhnfbkivgnwgxkxzmeahq",
"gwhhbsaxsfbvliaadwhmvqbsmm","yueftullmxjstdjndhavacztpz","qgdfurozusbhkwkweyckjihito",
"hsyfmokwswpbsqwkfatyvjjxvn","gxtzzykijfwpbcjvujvdjelqad","schvaamxxyfccknyairmbczova",
"prpczqgmoejptlsdjvxpekdmsl","tpzbifslbahnmqxuwmfpwjaxzd","zmzvxdbuvxqshhkdhcgttgeklo",
"bapottgrvfphjgetdzjljigrce","qchmszvyupudykrvvmwedikrro","sorbsssghuqanhbaeadihfenfz",
"xpfxjqibcrdlryqzasbaugrplm","ftqqeqgaecynmwyqrjuexpiyym","qusevqybwtwhfihodctmpxvpsw",
"jekrjafinseysrjyrjblxbrjkr","kriubpkzljnlghymdmlfcqvkfl","ynelgosfiujenvwsxozpogwmrt",
"bwovyaupolyunxdizxcvfgiezh","dtnxbsxayqdsrkmyxonxantril","mvuziguweifrcopnhpcrtcuwtz",
"emmvhnbzhnpogqeolyfdccfdxe","drbwfvjkjkhdmjtkbizodyluie","dnlqhhfxkssbapvllskvekmtcq",
"pwhxasjncajuqydghjcplakuxl","jlpkgahategcacybcrtftxiziq","tzsqfvyrklitvmvxuyrcqufvvz",
"llvedwbxmumqwktbyhdojrskid","mflduhadcdsxphellypuupfbjo","eswawcxpdwpoeyvcqxfzubipet",
"elkipbgwygrkvvkfqcdvlnener","uiubvbcqlxvmcwqwjvbhmwjmpc","bxgzxmsnexgkxmpxabvytmhnsg",
"rjgwbzxowqrzvpqgkiipaescos","clvozocvmnjrwofvvdswhhghta","oftwnsoxoklkbrekcxcrjdyywc",
"ypyndfvcvhpetolpotztybclpy","qeqqmxeusoraylprccsnaveqob","ftzqpxlcepcjxdmlgvwhjqarqc",
"lknkowqqniojgtgayvhvyjozeb","puregmukaplnuklmjgzamqxpqj","banhazwpcyzcoixvanulydhgxg",
"ualsqdmhjvvefxtskpeybngcps","ynnaealygpljdzzyjyomyrtjvc","cjcrjidyelnhmvuclduprioyls",
"ubmytsljvuahucisowrccobuds","fyxgsdrbhufncnyjywrvphgimd","aelyvvzpadkvasejnngfgbqdcm",
"wnqblvpiwsiuwzkkxqnqctbpus","sldozvuccovqppksxvrjtxhvit","blwlvuctjhyflwoaajonydhawf",
"yanxnkzuuoohugvwvsajsirnyy","ihrbchjartqzistxyufhikkdpi","vobmubnfxwqwsmrepvbakejcwq",
"tmuylmcheozhyvzbmjaksqzcyo","tgzuvgygvoddrxlgqrjdxititg","pgwijngnatnfbihmebudwtjler",
"dxrrliurddzesxfjnzpzipwbcx","hqiledlipgjttsuolgvewpenoh","pwmgljestkviesoennjabfeaua",
"xzkwilxuuskdewkpbhprenwbpk","kyfcxezexydiqrfigudsmalrjt","pplpapcmatogqmnjyiekpwpvra",
"phjwkhuzokavxhlwzatjlxxjdq","gsyctusmadnyospivhminahewx","lmdzpdgkiyxwqbymtiehjzyyzy",
"kfwscewqjsfcqerzffwjxmmwrh","urpjthfllddlezfcjknsaquvcm","lnpbcianhthqoxllhuhuzsotej",
"qcbhulhgowhkeukvxrkhnpznfv","nrzutnhymwbvimvhkmiiadtekc","cymovfxebyfbpctgdoxvxidfxd",
"tzlxsrjtqtvjjwleksukvgucfz","hazayipsqnzbfaktuvpocennad","bpsnljjapwjvochmnngbrvodxr",
"hogtixfirpsplzixcrorvigcfy","vpjxvpqtqmxpebotpuumxkjelf","gjafjpyikrvtqkrthzhcgsqrcq",
"eahepicxhbjbonywaxjrxlusjn","gowwxlxxunfwmzapdqgonvuhcr","bmciwhbxpcbrwgmscrbjtmsffv",
"wauarejjfnsooljglsygpyaxhi","dqdyxvdkmpzresxyuoeevunsux","rufegbpackdhaoexcgvucgqfnc",
"fgyqmlgjzhuygifcagnmwowykh","nenxavvhcxbcwwjxtvfuvlqdxl","pkxukiwvhtkdhrmdrnfxsmxszi",
"vtfcjikclyoqheslgiuhiohswd","qnzlnwlykjeaadsmzekhxdlhso","cswaxylbpvkvvqikxuhuytxtkq",
"fqjmtbizqhmsmkdlwnykdtusmv","dnndjrkxayykoxogxzqpoascsx","kudirlhijchbxgkmbjcawsnevk",
"ibredttvihgthxsssivbwkodni","ndfhyjujbdtgafauhclenwwauc","dlhltoeuettryyhahgfvsnqquc",
"zfovrjecgpvuwafzrcqrnvicwl","wvhtzzjslwrnntlsutdjgflsig","cwzprjhpoteypywhcqxybfaufy",
"kxpoqgfcxhtcutvicnwrwvbdht","yxuqrnebycfmmbpamcyrlceszk","qtfpzlcdylxjhnoovkprzzdtva",
"ofsufpklwvxryrdrjhrtpyntdy","jakbpbwgnyrbhmjtfqantjvgma","elcmiulwpdhgtywpkmuwvmugfb",
"bgkolrjiezcgbtisbadzsbblqy","bysrytewgztiucrvhdrydthsgi","sboobzfttoofahmhggcucroqdg",
"goijtkucwuxknglrkghfjlvviz","fbsjsfbdbculdfwqscatqffdlj","fovbbaxcponygdrkeikarmrrmu",
"llufcnbnmptjzqbycflcjyxnjs","wygrygxeliymlswyhfphtxkxza","dnnnwnplkcwkyqamxvuurrmraf",
"uxuouoqimlaauxwxhqbpkqldsp","gzoxvxqtzjntxpymongdvdmknz","byttjhdbzaiiosssioocvzrqdj",
"dtbgycbuevtufhhakgjrdbwqvq","iuvzjneslguzdsxjwbvjzxsrmv","sjgstthhqmxltbhokfojcvcavg",
"qouxkideeitotrmtlkkqbuxspo","gemdupryxphaoxcpobxcvbwwnr","ipwmzvkhoiomobunnifmgorwwm",
"pvclnzfftblusgyvwgnjfudyrv","hgcqqvwvdxudnhwbarzvnpregc","yegdjsadsklogryoibczqjquck",
"qqqmlzcpcwcbilnmabkbtqpxsz","ugaonbmhxyqczpcixqarkkfaoc","jduniiuwlqfothrmggvkthljdf",
"nowqnfexqyhkcdfbquibnskvzv","niqqufjmhieqwuufjntescbpth","xssruebqucbqirkzfsrwsrnard",
"vykwiekcgcualeubejlglpioyr","zqonaittpznvzaegctezvgrjak","oeeavxiwrfdroahrdzoqfhhokg",
"wkzeqstrweworaqypfrmznagew","miwoyjugqupmfspaarganpcztq","uqdhjmtdsmqqbakihtcdjxluht",
"rerhgugynhhapxvzcsosqhmhjb","aqtouyhjvicvlclouebjeaxsyx","bzqsbjniotkfvmpytspzprflmj",
"nvyflhjvasxfbkzhkraustdtfd","rrpnswfbjacrbuaommysxwhyjk","nbyjogzyrebeorlxmgshudnpjj",
"wxhsapvmnfteueguylfrgiugbf","qdnplnfptdszrgieohvxirwsko","anbeydgmminizphatxitsigmvf",
"tdfgzwzqlrmssxtwowqqkfclxc"}
*/
	
	public static void main(String[] args) {
		String[] words = new String[]{"word","good","best","good"};
		System.out.println(findSubstring("swordgoodgoodgoodbestword",words));
	}
	public static List<Integer> findSubstring(String s, String[] words) {
		int N = s.length();
		List<Integer> indexes = new ArrayList<Integer>(s.length());
		if (words.length == 0) {
			return indexes;
		}
		int M = words[0].length();
		if (N < M * words.length) {
			return indexes;
		}
		int last = N - M + 1;
		
		//map each string in words array to some index and compute target counters
		Map<String, Integer> mapping = new HashMap<String, Integer>(words.length);
		int [][] table = new int[2][words.length];
		int failures = 0, index = 0;
		for (int i = 0; 
			 i < words.length; 
			 ++i) {
			Integer mapped = mapping.get(words[i]);
			if (mapped == null) {
				++failures;
				mapping.put(words[i], index);
				mapped = index++;
			}
			++table[0][mapped];
		}
		
		//find all occurrences at string S and map them to their current integer, -1 means no such string is in words array
		int [] smapping = new int[last];
		for (int i = 0; 
			 i < last; 
			 ++i) {
			String section = s.substring(i, i + M);
			Integer mapped = mapping.get(section);
			if (mapped == null) {
				smapping[i] = -1;
			} else {
				smapping[i] = mapped;
			}
		}
		
		//fix the number of linear scans
		for (int i = 0; 
			 i < M; 
			 ++i) {
			//reset scan variables
			int currentFailures = failures; //number of current mismatches
			int left = i, right = i;
			Arrays.fill(table[1], 0);
			//here, simple solve the minimum-window-substring problem
			while (right < last) {
				while (currentFailures > 0 && 
					   right < last) {
					int target = smapping[right];
					if (target != -1 && 
						++table[1][target] == table[0][target]) {
						--currentFailures;
					}
					right += M;
				}
				while (currentFailures == 0 && 
					   left < right) {
					int target = smapping[left];
					if (target != -1 && 
						--table[1][target] == table[0][target] - 1) {
						int length = right - left;
						//instead of checking every window, we know exactly the length we want
						if ((length / M) ==  words.length) {
							indexes.add(left);
						}
						++currentFailures;
					}
					left += M;
				}
			}
			
		}
		return indexes;
	}

}
