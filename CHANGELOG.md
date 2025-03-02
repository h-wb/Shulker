## [0.5.2](https://github.com/jeremylvln/Shulker/compare/v0.5.1...v0.5.2) (2024-01-12)


### :warning: Reverts :warning:

* Revert "fix(shulker-operator): do not let Agones map the server ports (#330)" ([5a376cf](https://github.com/jeremylvln/Shulker/commit/5a376cf57b683180badf068a9cca76758e5caf53)), closes [#330](https://github.com/jeremylvln/Shulker/issues/330)

## [0.5.1](https://github.com/jeremylvln/Shulker/compare/v0.5.0...v0.5.1) (2024-01-08)


### :bug: Bug Fixes :bug:

* **deps:** update dependency io.grpc:grpc-netty-shaded to v1.60.1 ([#322](https://github.com/jeremylvln/Shulker/issues/322)) ([8303b6e](https://github.com/jeremylvln/Shulker/commit/8303b6e775ec897f219b654cbba21c467566f038))
* **deps:** update dependency net.kyori:adventure-platform-bungeecord to v4.3.2 ([#326](https://github.com/jeremylvln/Shulker/issues/326)) ([a9d6e34](https://github.com/jeremylvln/Shulker/commit/a9d6e3431d56d7a07cc53417f1410abbef627154))
* **deps:** update grpc to v1.60.1 ([#323](https://github.com/jeremylvln/Shulker/issues/323)) ([87e8641](https://github.com/jeremylvln/Shulker/commit/87e864154dec12e32e050461a5522fe467f4b695))
* **shulker-operator:** do not let Agones map the server ports ([#330](https://github.com/jeremylvln/Shulker/issues/330)) ([d1a9955](https://github.com/jeremylvln/Shulker/commit/d1a99552aea2093973d7ab7955a8e991cccf7084))


### :books: Documentation :books:

* promote next to latest ([8178611](https://github.com/jeremylvln/Shulker/commit/8178611ff4d2a40fe11155c42fab354abd79ff1a))

## [0.5.0](https://github.com/jeremylvln/Shulker/compare/v0.4.0...v0.5.0) (2024-01-03)


### :sparkles: Features :sparkles:

* **shulker-operator:** add the possibility to use custom server jars ([#254](https://github.com/jeremylvln/Shulker/issues/254)) ([72844b1](https://github.com/jeremylvln/Shulker/commit/72844b1c85e2680371109661279ad5fc52de7a6e))
* support mounting custom volumes to servers ([#281](https://github.com/jeremylvln/Shulker/issues/281)) ([5e7f774](https://github.com/jeremylvln/Shulker/commit/5e7f774764612da9f1cb584add0d038cfde980ea))


### :bug: Bug Fixes :bug:

* **deps:** update dependency com.google.api.grpc:proto-google-common-protos to v2.29.0 ([#276](https://github.com/jeremylvln/Shulker/issues/276)) ([e8c9e74](https://github.com/jeremylvln/Shulker/commit/e8c9e748d391ffaf17d7a7344ad55944019d928f))
* **deps:** update dependency com.google.guava:guava to v33 ([#312](https://github.com/jeremylvln/Shulker/issues/312)) ([49fe6bc](https://github.com/jeremylvln/Shulker/commit/49fe6bc481c49a4a2f2f788e71310f393ba6ee7d))
* **deps:** update dependency com.google.protobuf:protobuf-java to v3.25.1 ([#257](https://github.com/jeremylvln/Shulker/issues/257)) ([ba9d2cf](https://github.com/jeremylvln/Shulker/commit/ba9d2cfc968fccaa491f0d2509076d433b94dbd7))
* **deps:** update dependency io.grpc:grpc-netty-shaded to v1.59.1 ([#271](https://github.com/jeremylvln/Shulker/issues/271)) ([e2c7230](https://github.com/jeremylvln/Shulker/commit/e2c7230edcc66453715a405060229ee302351dcc))
* **deps:** update dependency io.grpc:grpc-netty-shaded to v1.60.0 ([#285](https://github.com/jeremylvln/Shulker/issues/285)) ([a60a643](https://github.com/jeremylvln/Shulker/commit/a60a643033a4d5ed907b42fefe939a0b6009906c))
* **deps:** update dependency net.kyori:adventure-api to v4.15.0 ([#311](https://github.com/jeremylvln/Shulker/issues/311)) ([5b66eec](https://github.com/jeremylvln/Shulker/commit/5b66eecb8fed2f232c677f078f1e84792fcad317))
* **deps:** update dependency redis.clients:jedis to v5.1.0 ([#266](https://github.com/jeremylvln/Shulker/issues/266)) ([81a52a7](https://github.com/jeremylvln/Shulker/commit/81a52a75faff9f41842fd7ce11fd619632dc1e53))
* **deps:** update fabric8-kubernetes-client monorepo to v6.9.2 ([#258](https://github.com/jeremylvln/Shulker/issues/258)) ([10af60c](https://github.com/jeremylvln/Shulker/commit/10af60c42452d72c65bfcc53edffd90d33bf004b))
* **deps:** update grpc to v1.59.1 ([#272](https://github.com/jeremylvln/Shulker/issues/272)) ([75c4cdd](https://github.com/jeremylvln/Shulker/commit/75c4cdddc2536794cbc5bc40e2b39361abe3465a))
* **deps:** update grpc to v1.60.0 ([#286](https://github.com/jeremylvln/Shulker/issues/286)) ([f538bf4](https://github.com/jeremylvln/Shulker/commit/f538bf41434d7fb1d1b634ccaf386cd4b331f6a7))
* regenerate crds ([456fc8b](https://github.com/jeremylvln/Shulker/commit/456fc8b4776c8b8ac10f5a6589b30e119d440d91))
* **shulker-operator:** custom annotations not added to ProxyFleet service ([#273](https://github.com/jeremylvln/Shulker/issues/273)) ([83e5f53](https://github.com/jeremylvln/Shulker/commit/83e5f53dce58c23b64058deb320b0b008a363b6a))

## [0.4.0](https://github.com/jeremylvln/Shulker/compare/v0.3.0...v0.4.0) (2023-11-28)


### :sparkles: Features :sparkles:

* **deploy:** add agones allocator env ([929c652](https://github.com/jeremylvln/Shulker/commit/929c652f6299e719f6068ce7a9fb5ee6259ffa92))
* **google-agones-sdk:** generate Rust SDK and update proto ([5d02808](https://github.com/jeremylvln/Shulker/commit/5d028089d4292f677c781f300b6240fd718bcd23))
* **google-open-match-sdk:** create auto-generated java sdk ([5235405](https://github.com/jeremylvln/Shulker/commit/523540595ecf2b29968106fd742e5e139a507fe6))
* **google-open-match-sdk:** create auto-generated sdk ([68f443d](https://github.com/jeremylvln/Shulker/commit/68f443d7d47a7157739b88a2f8d7a7a492ea6a73))
* **google-open-match-sdk:** regenerate java sdk ([e700916](https://github.com/jeremylvln/Shulker/commit/e700916e463ad136cf3bd67ab65ff62a44a4834c))
* remove usage of macro_use ([#197](https://github.com/jeremylvln/Shulker/issues/197)) ([74d4067](https://github.com/jeremylvln/Shulker/commit/74d4067016008735d83e0cd7bdfbb1cb636e5f98))
* **shulker-addon-matchmaking:** create director and mmf ([#210](https://github.com/jeremylvln/Shulker/issues/210)) ([72cd61f](https://github.com/jeremylvln/Shulker/commit/72cd61f21b92e8539c0ed3daf656da6d3871d0e3))
* **shulker-crds:** add network admins list to cluster ([86d7135](https://github.com/jeremylvln/Shulker/commit/86d7135c4fc83f3b094302583c224f816c8e5093))
* **shulker-operator:** add a Maven snapshot resolver ([2b82d07](https://github.com/jeremylvln/Shulker/commit/2b82d072cea299198138bd2fabe10764874cc8d6))
* **shulker-operator:** add support for folia ([5244336](https://github.com/jeremylvln/Shulker/commit/5244336c71f89962133945ed7329c83a83df277a))
* **shulker-operator:** decouple version of agent from the operator ([a231cfe](https://github.com/jeremylvln/Shulker/commit/a231cfee73742bcae9eea3475d11fcd77aec5c25))
* **shulker-operator:** inject SHULKER_NETWORK_ADMINS env to proxies and servers ([cafc0cb](https://github.com/jeremylvln/Shulker/commit/cafc0cb3a56efdd181bb7f78f36e75737a8c4e12))
* **shulker-operator:** rework summon sdk method to try to allocate an existing server first ([3b661a1](https://github.com/jeremylvln/Shulker/commit/3b661a1fa02b183df673f4b3fb3610cf63003ff1))
* **shulker-proxy-agent:** grant all permissions to network admins ([0f96077](https://github.com/jeremylvln/Shulker/commit/0f96077d85e7bd5dcee7f3aac0ae841df7e806a1))
* **shulker-server-agent:** grant network admins as operators ([d4fccbf](https://github.com/jeremylvln/Shulker/commit/d4fccbf68c099e484fe6588eeae2c84a939aa983))
* **shulker-server-agent:** hybrid support between paper and folia ([0b151eb](https://github.com/jeremylvln/Shulker/commit/0b151ebf546969b02adfcd473a7356cde8b8a877))


### :bug: Bug Fixes :bug:

* **deps:** update dependency io.grpc:grpc-protobuf to v1.59.0 ([#199](https://github.com/jeremylvln/Shulker/issues/199)) ([9d83dbc](https://github.com/jeremylvln/Shulker/commit/9d83dbc759a9ae5ff11d06234defa232cc0a4f70))
* **deps:** update dependency io.grpc:grpc-services to v1.59.0 ([#200](https://github.com/jeremylvln/Shulker/issues/200)) ([c501357](https://github.com/jeremylvln/Shulker/commit/c501357dcfbc3cbb628d304c8f710ec04864d3b5))
* **deps:** update dependency io.grpc:grpc-stub to v1.59.0 ([#201](https://github.com/jeremylvln/Shulker/issues/201)) ([e422ef2](https://github.com/jeremylvln/Shulker/commit/e422ef23d184a83e766fcdb3339dda77931d34f8))
* **deps:** update fabric8-kubernetes-client monorepo to v6.9.1 ([#214](https://github.com/jeremylvln/Shulker/issues/214)) ([022903c](https://github.com/jeremylvln/Shulker/commit/022903c370773705f4cb6cbd11e8c8c49680cf41))
* **deps:** update fabric8-kubernetes-client monorepo to v6.9.2 ([#228](https://github.com/jeremylvln/Shulker/issues/228)) ([9c5a37f](https://github.com/jeremylvln/Shulker/commit/9c5a37f53468d5ac3715dd1b20e17197b0dba973))
* **shulker-kube-utils:** use axum in metrics ([9608cfc](https://github.com/jeremylvln/Shulker/commit/9608cfcb407c48cb6b52988d4edcaf36a7e18649))
* **shulker-operator:** fleet labels not added to GameServers from MinecraftServerFleets ([4cf98b9](https://github.com/jeremylvln/Shulker/commit/4cf98b9305c44e32a82b8145c43506384c62fb2e))
* **shulker-operator:** network admins are optional ([020a1d0](https://github.com/jeremylvln/Shulker/commit/020a1d09f9ccef07de8f6f2b52d2cb0ba4f062bd))
* **shulker-operator:** prevent proxy connections only if LoadBalancer or NodePort service ([e8a4993](https://github.com/jeremylvln/Shulker/commit/e8a4993ffeacdb69550902fb2fd8cdc6a0338eac))
* **shulker-proxy-agent:** correctly create Jedis pool with credentials ([d3231d4](https://github.com/jeremylvln/Shulker/commit/d3231d49ac40b95694d73cf4b48af138f6e56349))
* **shulker-proxy-agent:** having no network admins tries to parse an empty string uuid ([47e26e8](https://github.com/jeremylvln/Shulker/commit/47e26e812af0a0a773b0ed4d2981663dbb5ccf68))
* **shulker-proxy-agent:** use a dedicated thread pool for redis pubsub ([afb575d](https://github.com/jeremylvln/Shulker/commit/afb575d0e3026c0ef028dd7dc44423240085cc8a))
* **shulker-server-agent:** use new agones package ([1adac9b](https://github.com/jeremylvln/Shulker/commit/1adac9b4a9289df739a4459b3aa3cb8a33f506c4))


### :warning: Reverts :warning:

* Revert "chore(deps): update nrwl monorepo to v17.1.1 (#239)" (#240) ([6080f92](https://github.com/jeremylvln/Shulker/commit/6080f921c739879664ace321de2a761c52d6764a)), closes [#239](https://github.com/jeremylvln/Shulker/issues/239) [#240](https://github.com/jeremylvln/Shulker/issues/240)


### :books: Documentation :books:

* add pages about helm and matchmaking ([#215](https://github.com/jeremylvln/Shulker/issues/215)) ([554277b](https://github.com/jeremylvln/Shulker/commit/554277bf4df26e286ff2f22baa22ef070aefc0ae))
* add section about network admins ([471960c](https://github.com/jeremylvln/Shulker/commit/471960c9323f06d31f1cd293e35967baa686e6b9))
* add section about player sync ([5040512](https://github.com/jeremylvln/Shulker/commit/5040512fc6834b27fe87a4a4f8da99f04965e562))
* fix dead links ([9994604](https://github.com/jeremylvln/Shulker/commit/999460448aaff8b9ae97259d02b603ad1d267dbc))
* fix typo ([#193](https://github.com/jeremylvln/Shulker/issues/193)) ([78650e1](https://github.com/jeremylvln/Shulker/commit/78650e1c1459306922a184c4af9701448b6f38f5))
* separate pages for next and latest ([b5afb9d](https://github.com/jeremylvln/Shulker/commit/b5afb9de5b774d20d76f11f09ace0eac398ef693))
* update Agones prerequisites ([ef4dcd5](https://github.com/jeremylvln/Shulker/commit/ef4dcd514166e94ea8c3b2bab3341ee8bdcf71e9))

## [0.3.0](https://github.com/jeremylvln/Shulker/compare/v0.2.0...v0.3.0) (2023-10-31)

### :sparkles: Features :sparkles:

- **shulker-crds:** add redis provided spec to cluster ([490db51](https://github.com/jeremylvln/Shulker/commit/490db51685f025c3c8ae4833022aa037d7dd58ce))
- **shulker-operator:** add ability to register hook with order ([76f6730](https://github.com/jeremylvln/Shulker/commit/76f673071587c9ee0e5840d3437a4e24b412870b))
- **shulker-operator:** deploy a managed single node redis ([#183](https://github.com/jeremylvln/Shulker/issues/183)) ([3e99751](https://github.com/jeremylvln/Shulker/commit/3e9975110eae92a5cee4ebfbf84ada1996fae6cd))
- **shulker-proxy-agent:** add glist, gtp and gfind commands ([850af26](https://github.com/jeremylvln/Shulker/commit/850af2615347fc7b0384ad1a33d7d305c7baf3d2))
- **shulker-proxy-agent:** display global player count on ping ([c29eac1](https://github.com/jeremylvln/Shulker/commit/c29eac17501fbf8942247de8c9b4e73546a6146a))
- **shulker-proxy-agent:** listen on teleport player pub sub ([e4f8d17](https://github.com/jeremylvln/Shulker/commit/e4f8d17804bdd4a1b08d584a461375be1cfdf576))
- **shulker-proxy-agent:** query mojang api to get unknown player names or ids ([e7eb734](https://github.com/jeremylvln/Shulker/commit/e7eb734e52cf655459314b3d65bccb3e8df05eaf))
- **shulker-proxy-agent:** sync proxies and players in Redis ([ec0211c](https://github.com/jeremylvln/Shulker/commit/ec0211c7a723e42b02f0c72ced46782d2bcb2b0e))
- **shulker-sdk:** add convenient Java wrapper ([4ac0c8c](https://github.com/jeremylvln/Shulker/commit/4ac0c8c25f9a5f70515f7dcf9fad03d334609b0f))

### :bug: Bug Fixes :bug:

- publish java libraries as normal jar ([d4083d1](https://github.com/jeremylvln/Shulker/commit/d4083d1e7f82741d52a41f028b94c16e6e1f5574))
- **shulker-operator:** assert valid cluster ref before reconciling ([#184](https://github.com/jeremylvln/Shulker/issues/184)) ([c207cce](https://github.com/jeremylvln/Shulker/commit/c207ccee0526dfc0bcebd75b47da91f81f5feeba))
- **shulker-operator:** keep extra annotations when reconciling a resource ([229b50c](https://github.com/jeremylvln/Shulker/commit/229b50c7347fbdeb8ad63c31081e8822f8e7184f))
- **shulker-operator:** patch existing resources with a fresh spec ([d2fcea3](https://github.com/jeremylvln/Shulker/commit/d2fcea387399679a5f09da6e7a697b017c8af65c))
- **shulker-operator:** plugins and patches joined with bad separator ([13d142e](https://github.com/jeremylvln/Shulker/commit/13d142ee40bef5c4553e114aaf9d808e641dfd84))
- **shulker-operator:** resolve maven secret in correct namespace ([a7b8d14](https://github.com/jeremylvln/Shulker/commit/a7b8d14ee7573646d06138616c12f5065df98670))
- **shulker-proxy-agent:** sync players, proxies and servers in Redis ([06529f6](https://github.com/jeremylvln/Shulker/commit/06529f68d34b53ba79443b1f668d8b2d89d7eb9a))

### :books: Documentation :books:

- fix dead link in README ([048bb66](https://github.com/jeremylvln/Shulker/commit/048bb66fe4cff3302948471f8872820ebed98442))

## [0.2.0](https://github.com/jeremylvln/Shulker/compare/v0.1.0...v0.2.0) (2023-10-25)

### :sparkles: Features :sparkles:

- add nodeselector to pod overrides ([123f169](https://github.com/jeremylvln/Shulker/commit/123f1697ed12de9d3c042e450f23556b8fa0e969))
- add tolerations to pod overrides ([4290b19](https://github.com/jeremylvln/Shulker/commit/4290b19d8c16256379faf34b23be10de119c1d21))
- **java-sdk:** create java sdk ([745b299](https://github.com/jeremylvln/Shulker/commit/745b299bc4e05533d906dba5a94bbf86707eebad))
- move API source to agents projects [breaking change] ([c307c02](https://github.com/jeremylvln/Shulker/commit/c307c02731bb778abae0761352ebe02cdb4a5cf4))
- **operator:** add built-in autoscaling to fleets ([#112](https://github.com/jeremylvln/Shulker/issues/112)) ([1dc72a1](https://github.com/jeremylvln/Shulker/commit/1dc72a1c4ca0a8affb304ec4239e111b2af4f15c))
- **server-agent:** add explicit api-version in paper yml ([5ab4147](https://github.com/jeremylvln/Shulker/commit/5ab4147151ade8098808bac42921638529a95ec9))

### :bug: Bug Fixes :bug:

- correctly update proxy service annotations ([40db68b](https://github.com/jeremylvln/Shulker/commit/40db68bb599834d79a898741889184ed1c695963))
- **deps:** manual bump ([#128](https://github.com/jeremylvln/Shulker/issues/128)) ([7d9dbdf](https://github.com/jeremylvln/Shulker/commit/7d9dbdfb20f82eb6337116435566df960dda39a9))
- **deps:** update dependency net.kyori:adventure-api to v4.14.0 ([#137](https://github.com/jeremylvln/Shulker/issues/137)) ([8cea5eb](https://github.com/jeremylvln/Shulker/commit/8cea5eb3b3627faefa12e95748234cb79e46b6b5))
- **deps:** update dependency net.kyori:adventure-platform-bungeecord to v4.3.0 ([#138](https://github.com/jeremylvln/Shulker/issues/138)) ([293d43d](https://github.com/jeremylvln/Shulker/commit/293d43d8d584b13bd1695c80c06bfbd400684610))
- **deps:** update dependency net.kyori:adventure-platform-bungeecord to v4.3.1 ([#145](https://github.com/jeremylvln/Shulker/issues/145)) ([e5e2c84](https://github.com/jeremylvln/Shulker/commit/e5e2c84cc14c347d7bf72711ffd74c3c04915fa7))
- **deps:** update dependency net.md-5:bungeecord-api to v1.20-r0.1 ([#139](https://github.com/jeremylvln/Shulker/issues/139)) ([355db1e](https://github.com/jeremylvln/Shulker/commit/355db1ee660793b54052be13abc2f8b3f230e9cb))
- **deps:** update fabric8-kubernetes-client monorepo to v6.8.1 ([#140](https://github.com/jeremylvln/Shulker/issues/140)) ([47704cf](https://github.com/jeremylvln/Shulker/commit/47704cf864c9d5ef582794a9c10230e8d324e556))
- **deps:** update fabric8-kubernetes-client monorepo to v6.9.0 ([#168](https://github.com/jeremylvln/Shulker/issues/168)) ([62b1517](https://github.com/jeremylvln/Shulker/commit/62b1517379b8ac714f4069d394092b3c524ba6a8))
- listen and update correctly the resources ([e69d3de](https://github.com/jeremylvln/Shulker/commit/e69d3dea285878e73626b19f2dd7587151d41d8f))
- **shulker-crds:** use native default system whenever possible ([#153](https://github.com/jeremylvln/Shulker/issues/153)) ([2f89a51](https://github.com/jeremylvln/Shulker/commit/2f89a51f3d7028fa03e054b8f958effbdf907dd3))

### :books: Documentation :books:

- add CODE_OF_CONDUCT.md ([d7fcc0b](https://github.com/jeremylvln/Shulker/commit/d7fcc0b51abb7745ed72023602980dde2e315f42))
- add coverage badge ([1756f67](https://github.com/jeremylvln/Shulker/commit/1756f676ec902be1dc905016040891a0b646661e))
- add open graph meta ([7560590](https://github.com/jeremylvln/Shulker/commit/756059073717cdae4bbca7c80c57356074ac5b06))
- add recipes for plugins, pod overrides, and proxy protocol ([#117](https://github.com/jeremylvln/Shulker/issues/117)) ([ad935a2](https://github.com/jeremylvln/Shulker/commit/ad935a26b4221909a097a0b18c4985f1412b5426))
- add text about commercial license ([40ecd71](https://github.com/jeremylvln/Shulker/commit/40ecd7124be49b55e791e36b78184c8f7f2ff96e))
- fix header dead link ([037575b](https://github.com/jeremylvln/Shulker/commit/037575b244d1df7c6339889091d08537b33e7c8b))
- fix proxyfleet in example ([#110](https://github.com/jeremylvln/Shulker/issues/110)) ([99d7ca0](https://github.com/jeremylvln/Shulker/commit/99d7ca0691fa4052afaad7599a0eee92725e9431))
- migrate to vitepress ([#165](https://github.com/jeremylvln/Shulker/issues/165)) ([fe7a7e4](https://github.com/jeremylvln/Shulker/commit/fe7a7e4a54171e072d1fad767de0ad10005e2eb8))
