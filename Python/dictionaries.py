capitals = {'USA': 'Washington DC', 'Japan': 'Tokyo', 'Canada': 'Toronto'}
#print(capitals['USA'])
print(capitals.get('USA'))
#print(capitals.keys())
#print(capitals.items())
#capitals.pop('USA')

capitals.update({'Germany': 'Berlin'})

for key, value in capitals.items():
    print(key, value)